package MonApp;


import Entities.Commentaire;
import Entities.Secteur;
import Entities.Spot;
import Entities.User;
import Model.CommentaireDAO;
import Model.SecteurDAO;
import Model.SpotDAO;
import Model.UserDAO;
import com.octest.servlets.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainApp {


    public static void main(String[] args)  {


        Scanner sc=new Scanner( System.in );

        Test test = new Test();
        User user = new User( sc );
        UserDAO userDAO = new UserDAO();
        Spot spot = new Spot(sc  );
        SpotDAO spotDAO = new SpotDAO();
        Secteur secteur = new Secteur (sc);
        SecteurDAO secteurDAO = new SecteurDAO();
        Commentaire commentaire = new Commentaire(sc, user );
        CommentaireDAO commentaireDAO = new CommentaireDAO();

       // Commentaire commentaire1 = new Commentaire();
       // Commentaire commentaire2 = new Commentaire();

        List<Commentaire> commentaireList = new ArrayList<>();
        //commentaireList.add( commentaire1);
        //commentaireList.add (commentaire2);






        try {

            userDAO.saveUser( user );
            spotDAO.saveSpot( spot );
            secteurDAO.saveSecteur( secteur );
            commentaireDAO.saveCommentaire( commentaire );
            //user.setCommentaires( commentaireList );
           // user.setCommentaire(commentaire );
           // user.setSpot(spot);
            user.setCommentaires( (Set<Commentaire>) commentaireList );



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
