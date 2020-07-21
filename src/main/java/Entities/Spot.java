package Entities;

import javax.persistence.*;
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

    public void scanName(Scanner sc){
        System.out.println ("spotName: ");
        String inputName = sc.nextLine();
        this.setName(inputName );
    }




}
