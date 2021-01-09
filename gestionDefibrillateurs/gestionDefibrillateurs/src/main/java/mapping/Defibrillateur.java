package mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.*;

public class Defibrillateur {

    private int id;
    private String geoPoint;
    private String nomSite;
    private String adresse;
    private String commune;
    private String emplacement;
    private String typeDispositif;
    private Structure structure;

    private float coordX;
    private float coordY;

    public Defibrillateur(int id, String geoPoint, String nomSite, String adresse, String commune, String emplacement,
                          String typeDispositif, Structure structure) {
        this.id = id;
        this.geoPoint = geoPoint;
        this.nomSite = nomSite;
        this.adresse = adresse;
        this.commune = commune;
        this.emplacement = emplacement;
        this.typeDispositif = typeDispositif;
        this.structure = structure;
        this.parseCoords();
    }

    public static Defibrillateur create(ResultSet resultSet) {

        try {

            int id = resultSet.getInt("id");
            String geoPoint = resultSet.getString("geo_point");
            String nomSite = resultSet.getString("nom_site");
            String adresse = resultSet.getString("adresse");
            String commune = resultSet.getString("commune");
            String emplacement = resultSet.getString("emplacement");
            String typeDispositif = resultSet.getString("type_dispositif");
            String typeStructure = resultSet.getString("type_structure");
            String categorieStructure = resultSet.getString("categorie_structure");
            String accessibilite = resultSet.getString("accessibilite");

            Structure structure = new Structure(typeStructure, categorieStructure, accessibilite);
            Defibrillateur defibrillateur = new Defibrillateur(id, geoPoint, nomSite, adresse, commune, emplacement, typeDispositif, structure);
            return defibrillateur;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public static List<Defibrillateur> get3Nearest(List<Defibrillateur> list, float x, float y) {
        List<Defibrillateur> nearest = new ArrayList<>(3);

        Map<Defibrillateur, Float> distances = new HashMap<>();

        for(Defibrillateur def : list) {
            distances.put(def,Float.valueOf((float) Math.sqrt(Math.pow(def.getCoordX() - x, 2) + Math.pow(def.getCoordY() - y, 2))));
        }

        for(int i=0; i<3; i++) {
            Defibrillateur nearestDefib = getNearest(distances);
            nearest.add(nearestDefib);
            distances.remove(nearestDefib);
        }

        return nearest;
    }

    public static Defibrillateur getNearest(Map<Defibrillateur, Float> map){
        Float min = Float.valueOf(1000000000);
        Defibrillateur defibrillateur = null;

        for(Map.Entry entry : map.entrySet()) {
            if((Float)entry.getValue() < min) {
                min = (Float)entry.getValue();
                defibrillateur = (Defibrillateur)entry.getKey();
            }
        }
        return defibrillateur;
    }

    public void parseCoords() {
        String[] coords = this.geoPoint.split(",", 2);
        if(coords.length == 2) {
            this.coordX = Float.parseFloat(coords[0]);
            this.coordY = Float.parseFloat(coords[1]);
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(String geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getNomSite() {
        return nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getTypeDispositif() {
        return typeDispositif;
    }

    public void setTypeDispositif(String typeDispositif) {
        this.typeDispositif = typeDispositif;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setTypeStructure(Structure structure) {
        this.structure = structure;
    }

    public float getCoordX() {
        return coordX;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }

    public float getCoordY() {
        return coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }

}
