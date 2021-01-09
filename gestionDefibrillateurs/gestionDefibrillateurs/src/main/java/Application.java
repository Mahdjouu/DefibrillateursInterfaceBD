import UI.Interface;
import database.Connexion;

public class Application {

    private static String address = "jdbc:oracle:thin:@telline.univ-tlse3.fr:1521:etupre";
    private static String user = "mlr2881a";
    private static String pwd = "sibd2020";
    private static String pwdInterface = "sibd2020";


    public static void main(String[] args) {

        Connexion connexion = new Connexion(address, user, pwd);

        if(connexion.connect()) {

            Interface inter = new Interface(connexion, pwdInterface);
            inter.createAndDisplay();

        }

    }

}