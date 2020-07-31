package Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
@Table (name="spot")//spécification nom table forcé
public class Spot {

    @Id
    //norme
    @GeneratedValue(strategy=GenerationType.IDENTITY)//se charge de mettre à jour l'id dans bdd
    @Column (name = "id")
    private Long id;
    @Column (name="Nom_spot")
    private String name;

  /*  @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name= "user_id")//, nullable=false)
    private User user;*/

    @ManyToOne(targetEntity=User.class, fetch = FetchType.LAZY)
    @JoinColumn(name="companyId")//Optional
    private User user;


    @OneToMany(targetEntity=Commentaire.class, mappedBy="spot")
    private List<Commentaire> commentaires = new ArrayList<>();
    /*@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name= "Commentaire")
    private Commentaire commentaire;
    private List<Commentaire> commentaires;*/

   /* @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="commentaire_id")
    private Commentaire commentaire;*/


    public Spot(Scanner sc) {
        this.scanName(sc);
    }

    public Spot() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires=commentaires;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }
    /*public User getUser (){ return user;}
    public void setUser(User user){ this.user=user;}*/

  /*  public Commentaire getCommentaire(){ return commentaire;}
    public void setCommentaire(Commentaire commentaire){this.commentaire=commentaire;}*/



    public void scanName(Scanner sc){
        System.out.println ("spotName: ");
        String inputName = sc.nextLine();
        this.setName(inputName );
    }

}
