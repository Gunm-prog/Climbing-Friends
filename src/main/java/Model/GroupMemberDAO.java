package Model;


import Entities.GroupMember;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GroupMemberDAO {


    EntityManagerFactory emf=Persistence.createEntityManagerFactory( "connect" );

    public void saveGroupMember (GroupMember groupMember){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //On va vérifier qu'un utilisateur existe dans une condition
        //qui nous permettra d'ajouter ou de MAJ un client dans notre BDD
        if (groupMember.getId()==null){
            em.persist( groupMember );
        }else{
            em.merge(groupMember);
        }

        //toujours un début et une fin lorsqu'on a besoin d'une transaction
        //pour l'ajout ou modification de données
        //pas besoin transaction pour lire des données
        tx.begin();
        tx.commit();
    }
    //Lire données BDD
    public GroupMember showGroupMember (Long id){
        EntityManager em = emf.createEntityManager();
        return em.find(GroupMember.class, id);
    }

    //Effacer données
    public void deleteGroupMember(Long id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove( em.find( GroupMember.class, id ));
        tx.commit();
    }








}