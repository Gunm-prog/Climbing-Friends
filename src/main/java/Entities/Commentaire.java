package Entities;

import javax.persistence.*;
import java.util.Scanner;

@Entity
public class Commentaire {
    @Id
    //norme
    @GeneratedValue(strategy=GenerationType.IDENTITY)//se charge de mettre à jour l'id dans bdd
    @Column(name = "id")
    private Long id;
    @Column (name= "name")
    private String name;
    @Column (name= "content")
    private String content;
    @ManyToOne()
    @JoinColumn(name= "user_id", nullable=false)
    private User user;

    @ManyToOne()
    @JoinColumn(name="spot_id")
    private Spot spot;

    public Commentaire(Scanner sc, User user, Spot spot) {
        this.user=user;//TODO à vérifier cet ajout de constructeur
        this.spot=spot;
        this.scanName(sc);

        this.scanContent(sc);
    }

    public Commentaire() {

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content=content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }

    public Spot getSpot (){ return spot;}
    public void setSpot(Spot spot){ this.spot=spot;}
    /*public void scanId(Scanner sc){
        System.out.println("");
    }*/
    public void scanName(Scanner sc){
        System.out.println("Title: ");
        String inputName = sc.nextLine();
        this.setName(inputName);
    }

    public void scanContent(Scanner sc){
        System.out.println("Content: ");
        String inputContent = sc.nextLine();
        this.setContent(inputContent);
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}



