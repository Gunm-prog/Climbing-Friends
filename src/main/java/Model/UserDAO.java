package Model;
import Entities.User;
import com.mysql.cj.xdevapi.SessionFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class UserDAO {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory( "connect" );
    private Scanner sc=new Scanner( System.in );
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }
    public void saveUser(User user) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        //On va vérifier qu'un utilisateur existe dans une condition
        //qui nous permettra d'ajouter ou de MAJ un client dans notre BDD
        if (user.getId() == null) { //TODO
            em.persist( user );
        } else {
            em.merge( user );
        }
        //toujours un début et une fin lorsqu'on a besoin d'une transaction
        //pour l'ajout ou modification de données
        //pas besoin transaction pour lire des données
        tx.begin();
        tx.commit();
        em.close();
    }
  /*  public SessionFactory getSessionFactory() {
        return sessionFactory;
    }*/
}
/*
    //Lire données BDD
    public User showUser (Long id){
        EntityManager em = emf.createEntityManager();
        return em.find(User.class, id);
    }
*/








