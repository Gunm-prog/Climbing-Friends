package Model;

import Entities.GroupMember;
import Entities.Secteur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class SecteurDAO {



    EntityManagerFactory emf=Persistence.createEntityManagerFactory( "connect" );
    private Scanner sc = new Scanner (System.in);


    public void saveSecteur (Secteur secteur){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //On va vérifier qu'un utilisateur existe dans une condition
        //qui nous permettra d'ajouter ou de MAJ un client dans notre BDD
        if (secteur.getId()==null){
            em.persist(secteur);
        }else{
            em.merge(secteur);
        }

        //toujours un début et une fin lorsqu'on a besoin d'une transaction
        //pour l'ajout ou modification de données
        //pas besoin transaction pour lire des données
        tx.begin();
        tx.commit();
        em.close();
    }
  /*  //Lire données BDD
    public Secteur showSecteur (Long id){
        EntityManager em = emf.createEntityManager();
        return em.find(Secteur.class, id);
    }*/

}

