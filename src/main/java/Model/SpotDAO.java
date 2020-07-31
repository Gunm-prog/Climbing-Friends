package Model;

import Entities.Spot;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class SpotDAO {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory( "connect" );
        private Scanner sc = new Scanner (System.in);

        public void saveSpot (Spot spot){
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            //On va vérifier qu'un utilisateur existe dans une condition
            //qui nous permettra d'ajouter ou de MAJ un client dans notre BDD
            if (spot.getId()== null){ //TODO
                em.persist( spot );
            }else{
                em.merge(spot);
            }

            //toujours un début et une fin lorsqu'on a besoin d'une transaction
            //pour l'ajout ou modification de données
            //pas besoin transaction pour lire des données
            tx.begin();
            em.persist( spot );
            tx.commit();
            em.close();
        }

    /*
    //Lire données BDD
    public User showUser (Long id){
        EntityManager em = emf.createEntityManager();
        return em.find(User.class, id);
    }
*/

    }


