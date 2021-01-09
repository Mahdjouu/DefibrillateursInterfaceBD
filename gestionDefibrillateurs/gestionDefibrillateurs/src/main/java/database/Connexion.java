package database;

import mapping.Defibrillateur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Connexion {

    private boolean connected;
    private String address;
    private String username;
    private String password;
    private Connection connection;
    private Statement statement;

    public Connexion(String address, String username, String password) {
        this.connected = false;
        this.address = address;
        this.username = username;
        this.password = password;
        this.connection = null;
    }

    public boolean connect() {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            this.connected = false;
            System.err.println("Could not find the Oracle JDBC Driver");
            e.printStackTrace();
            return false;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        try {

            connection = DriverManager.getConnection(address, username, password);
            statement = connection.createStatement();

        } catch (SQLException e) {

            this.connected = false;
            System.err.println("Connection Failed!");
            e.printStackTrace();
            return false;

        }

        if (connection != null) {

            this.connected = true;
            System.out.println("Connection successfully established!");
            return true;

        } else {

            this.connected = false;
            System.err.println("Connection Failed!");
            return false;

        }
    }

    public ResultSet executeQuery(String query) {

        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Could not execute query : " + query);
            e.printStackTrace();
            return null;
        }
    }

    public int executeUpdate(String query) {

        try {
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("Could not execute update : " + query);
            e.printStackTrace();
            return 0;
        }
    }


    /*
    ____________________________
        REQUETES SQL
    ____________________________
    */

    public List<String> getTypeDispo() {
        List<String> list = new ArrayList<>();
        ResultSet resultSet = executeQuery("SELECT DISTINCT TYPE_DISPOSITIF FROM DEFIBRILLATEUR ORDER BY TYPE_DISPOSITIF");

        try {
            while (resultSet.next())
                list.add(resultSet.getString("TYPE_DISPOSITIF"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getTypeStruct() {
        List<String> list = new ArrayList<>();
        ResultSet resultSet = executeQuery("SELECT DISTINCT TYPE_STRUCTURE FROM STRUCTURE ORDER BY TYPE_STRUCTURE");

        try {
            while (resultSet.next())
                list.add(resultSet.getString("TYPE_STRUCTURE"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getCategorieStruct() {
        List<String> list = new ArrayList<>();
        ResultSet resultSet = executeQuery("SELECT DISTINCT CATEGORIE_STRUCTURE FROM STRUCTURE ORDER BY CATEGORIE_STRUCTURE");

        try {
            while (resultSet.next())
                list.add(resultSet.getString("CATEGORIE_STRUCTURE"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getAccessibilite() {
        List<String> list = new ArrayList<>();
        ResultSet resultSet = executeQuery("SELECT DISTINCT accessibilite FROM structure ORDER BY accessibilite");

        try {
            while (resultSet.next())
                list.add(resultSet.getString("accessibilite"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Defibrillateur> getDefibrillateursFiltres(String typeDispo, String typeStruct, String catStruct, String accessibilite) {

        List<Defibrillateur> list = new ArrayList<>();
        ResultSet resultSet = executeQuery(
                "SELECT * FROM defibrillateur, structure" +
                        " WHERE defibrillateur.type_structure = structure.type_structure" +
                        " AND type_dispositif LIKE '%" + typeDispo + "%'" +
                        " AND defibrillateur.type_structure LIKE '%" + typeStruct + "%'" +
                        " AND categorie_structure LIKE '%" + catStruct + "%'" +
                        " AND accessibilite LIKE '%" + accessibilite + "%'" +
                        " ORDER BY id");

        try {
            while (resultSet.next())
                list.add(Defibrillateur.create(resultSet));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<Defibrillateur> getDefibrillateursCoords(String coordX, String coordY) {

        List<Defibrillateur> list = new ArrayList<>();
        ResultSet resultSet = executeQuery(
                "SELECT * FROM defibrillateur, structure" +
                        " WHERE defibrillateur.type_structure = structure.type_structure" +
                        " ORDER BY id");

        try {
            while (resultSet.next())
                list.add(Defibrillateur.create(resultSet));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Defibrillateur> nearest = Defibrillateur.get3Nearest(list, Float.valueOf(coordX), Float.valueOf(coordY));

        return nearest;
    }

    public int getMaxId() {

        ResultSet resultSet = executeQuery("SELECT MAX(id) FROM defibrillateur");

        int id = 0;

        try {
            resultSet.next();
            id = resultSet.getInt("MAX(id)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return id;
    }

    public int deleteDefibrillateur(int id) {

        return executeUpdate("DELETE FROM defibrillateur WHERE id = " + id);

    }

    public int updateDefibrillateur(int id, String geoPoint, String nomSite, String adresse, String commune, String emplacement,
                                    String typeDispositif, String typeStruct) {
        return executeUpdate("UPDATE defibrillateur SET" +
                " geo_point = '" + geoPoint + "'," +
                " nom_site = '" + nomSite + "'," +
                " adresse = '" + adresse + "'," +
                " commune = '" + commune + "'," +
                " emplacement = '" + emplacement + "'," +
                " type_dispositif = '" + typeDispositif + "'," +
                " type_structure = '" + typeStruct + "'" +
                "WHERE id = " + id
                );
    }

    public int addDefibrilateur(int id, String geoPoint, String nomSite, String adresse, String commune, String emplacement,
                                String typeDispositif, String typeStruct) {
        return executeUpdate("INSERT INTO defibrillateur (id, geo_point, nom_site, adresse, commune, emplacement, type_dispositif, type_structure)" +
                " VALUES ('" + id + "', '" + geoPoint + "', '" + nomSite + "', '" + adresse + "', '" + commune + "', '" + emplacement + "', '" + typeDispositif + "', '" + typeStruct + "')");
    }

    public Defibrillateur getDefibrillateurInfos(int id) {
        ResultSet resultSet = executeQuery("SELECT * FROM defibrillateur, structure WHERE defibrillateur.type_structure = structure.type_structure AND id = " + id);

        Defibrillateur defibrillateur = null;

        try {
            if(resultSet.next());
                defibrillateur = Defibrillateur.create(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return defibrillateur;
    }

    public String[] getCatAccessByType(String typeStructure) {
        ResultSet resultSet = executeQuery("SELECT categorie_structure, accessibilite FROM structure WHERE type_structure = '" + typeStructure + "'");

        String[] strings = new String[2];

        try {
            if(resultSet.next()) {
                strings[0] = resultSet.getString("categorie_structure");
                strings[1] = resultSet.getString("accessibilite");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return strings;
    }









    /*
    ____________________________
        GETTERS & SETTERS
    ____________________________
    */

    public boolean isConnected() {
        return connected;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
