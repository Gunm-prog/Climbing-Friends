package MonApp;

import Entities.Secteur;
import Entities.Spot;
import Entities.User;
import Model.SecteurDAO;
import Model.SpotDAO;
import Model.UserDAO;

import java.util.Scanner;


public class MainApp {


    public static void main(String[] args)  {
        Scanner sc=new Scanner( System.in );


        User user = new User( sc );
        UserDAO userDAO = new UserDAO();
        Spot spot = new Spot(sc  );
        SpotDAO spotDAO = new SpotDAO();
        Secteur secteur = new Secteur (sc);
        SecteurDAO secteurDAO = new SecteurDAO();

        try {

            userDAO.saveUser( user );
            spotDAO.saveSpot( spot );
            secteurDAO.saveSecteur( secteur );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


       /*GroupMemberDAO groupMemberDAO = new GroupMemberDAO();

        GroupMember lily = new GroupMember();
        //lily.setId( 1L );
        lily.setName( "lily" );

        groupMemberDAO.saveGroupMember(lily);

        System.out.println("groupMember: " + groupMemberDAO.showGroupMember( 1L ).getName());

        groupMemberDAO.deleteGroupMember( 1L );

        //En lancant le programme nous aurons:
        //Exception in thread "main" java.lang.NullPointerException
        //	at MonApp.MainApp.main(MainApp.java:26)
        //puisque le groupMember que nous demandons a été effacé
        System.out.println(groupMemberDAO.showGroupMember( 1L ).getName());
*/
