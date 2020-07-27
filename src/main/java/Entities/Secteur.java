package Entities;

import javax.persistence.*;
import java.util.Scanner;

@Entity
    @Table(name="secteur")//spécification nom table forcé
    public class Secteur {

        @Id
        //norme
        @GeneratedValue(strategy=GenerationType.IDENTITY)//se charge de mettre à jour l'id dans bdd
        @Column(name="id")
        private Long id;
        @Column(name="Nom_secteur")
        private String name;



        public Secteur(Scanner sc) {
            //this.scanId(sc);
            this.scanName(sc);
        }

    public Secteur() {

    }

    public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id=id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name=name;
        }

   /* public void scanId(Scanner sc){
        System.out.println ("secteurId: ");
        String inputName = sc.nextLine();
        this.setName(inputName );
    }*/

    public void scanName(Scanner sc){
        System.out.println ("secteurName: ");
        String inputName = sc.nextLine();
        this.setName(inputName );
    }


    }

