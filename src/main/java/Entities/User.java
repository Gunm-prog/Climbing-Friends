package Entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Scanner;

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

    public void scanName(Scanner sc){
        System.out.println ("userName: ");
        String inputName = sc.nextLine();
        this.setName(inputName );
        System.out.println("vous avez saisi: " + inputName + "name");
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


}
