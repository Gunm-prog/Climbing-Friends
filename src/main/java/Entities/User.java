package Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


@Entity
@Table (name="User")//spécification nom table forcé
public class User{

    @Id
    //norme
    @GeneratedValue(strategy=GenerationType.IDENTITY)//se charge de mettre à jour l'id dans bdd
    @Column (name = "id")
    private Long id;
    @Column (name="name")
    private String name;
    @Column (name= "email")
    private String email;
    @Column (name= "pseudo")
    private String pseudo;
    @Column (name= "password")
    private String password;

   /* @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name= "Commentaire")
    private Commentaire commentaire;
   // private List<Commentaire> commentaires;*/

   /* @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="spot_id")
    private Spot spot;*/

    @OneToMany(targetEntity = Commentaire.class, cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Commentaire> commentaire;

    @OneToMany(targetEntity=Spot.class, mappedBy="user")
    private List<Spot> spot = new ArrayList<>();
   /* @OneToMany(targetEntity = Spot.class, mappedBy = "user")
    public List<Spot> spot;*/

    //@Column (name= "created_at")
  //  private LocalDateTime createdAt;

    //private LocalDateTime updatedAt;
    //private LocalDateTime deletedAt;

   // private Scanner sc = new Scanner( System.in );

    public User(){
    }


    public User(Scanner sc) {
        this.scanName(sc);
        this.scanEmail(sc);
        this.scanPseudo(sc);
        this.scanPassword(sc);
    }

    public Long getId() {
        return  id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        //String inputName;
        //System.out.println(" Name: ");
        // inputName= sc.nextLine();
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPseudo(){
        return this.pseudo;
    }

    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public List<Spot> getSpot() {
        return spot;
    }

    public void setSpot(List<Spot> spot) {
        this.spot=spot;
    }

    public Set<Commentaire> getCommentaire() {
        return commentaire;
    }

    public void setCommentaires(Set<Commentaire> commentaire) {
        this.commentaire=commentaire;
    }
    /*public Spot getSpot(){return (Spot) spot;}
    public void setSpot(Spot spot){ this.spot=(List<Spot>) spot;}*/

 /*   public Commentaire getCommentaire(){return commentaire;}
    public void setCommentaire (Commentaire commentaire){ this.commentaire=commentaire;}*/


    public void scanName(Scanner sc){
        System.out.println ("userName: ");
        String inputName = sc.nextLine();
        this.setName(inputName );
        System.out.println("vous avez saisi: " + inputName + "");
    }



    public void scanEmail(Scanner sc){
        System.out.println("Email: ");
        String inputEmail = sc.nextLine();
        this.setEmail( inputEmail );
        System.out.println("vous avez saisi: " + inputEmail + "email");
    }

    public void scanPseudo(Scanner sc){
        System.out.println("Pseudo: ");
        String inputPseudo = sc.nextLine();
        this.setPseudo (inputPseudo);
    }

    public void scanPassword(Scanner sc){
        System.out.println("Password: ");
        String inputPassword = sc.nextLine();
        this.setPassword(inputPassword);
    }

    /*public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires=commentaires;
    }*/
}
