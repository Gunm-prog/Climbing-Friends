package Model;

import Entities.Commentaire;
import Entities.Spot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class CommentaireDAO {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory( "connect" );
    private Scanner sc = new Scanner (System.in);


    public void saveCommentaire (Commentaire commentaire){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //On va vérifier qu'un utilisateur existe dans une condition
        //qui nous permettra d'ajouter ou de MAJ un client dans notre BDD
        if (commentaire.getId()==null){
            em.persist( commentaire);
        }else{
            em.merge(commentaire);
        }

        //toujours un début et une fin lorsqu'on a besoin d'une transaction
        //pour l'ajout ou modification de données
        //pas besoin transaction pour lire des données
        tx.begin();
        tx.commit();
        em.close();
    }




}
