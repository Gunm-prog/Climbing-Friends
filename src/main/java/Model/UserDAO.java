package Model;

import Entities.User;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;



public class UserDAO {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory( "connect" );
    private Scanner sc=new Scanner( System.in );
    private SessionFactory sessionFactory;
    private Long Id;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    public void saveUser(User user) {

        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        //On va vérifier qu'un utilisateur existe dans une condition
        //qui nous permettra d'ajouter ou de MAJ un client dans notre BDD
        tx.begin();
        if (user.getId() == null) { //TODO
            em.persist( user );
        } else {
            em.merge( user );
        }
        //toujours un début et une fin lorsqu'on a besoin d'une transaction
        //pour l'ajout ou modification de données
        //pas besoin transaction pour lire des données

        em.flush();
        tx.commit();
        //em.close();





        //Lire données BDD
     /*  public User showUser (Long Id){
            em=emf.createEntityManager();
            return em.find( User.class, Id );
        }*/

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}







