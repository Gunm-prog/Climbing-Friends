package MonApp;

import Entities.Secteur;
import Entities.Spot;
import Entities.User;
import Model.SecteurDAO;
import Model.SpotDAO;
import Model.UserDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;


public class MainApp {

   // public MainApp() {


    public static void main(String[] args)  {
        Scanner sc=new Scanner( System.in );

       EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        try {
            entityManagerFactory=Persistence.createEntityManagerFactory( "connect" );
            entityManager=entityManagerFactory.createEntityManager();
            System.out.println( " Creating User" );
            new User( sc );
            new UserDAO();

            System.out.println( "Creaating Spot" );
            new Spot( sc );
            new SpotDAO();

            System.out.println( "Creating secteur" );
            new Secteur( sc );
            new SecteurDAO();

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
