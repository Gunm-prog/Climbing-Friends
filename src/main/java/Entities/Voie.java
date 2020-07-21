package Entities;

import java.util.List;

public class Voie  {

    private List listSecteurId;
    private String name;
    private int hauteurVoie;
    private int nombreLongueurs;

    public Voie(List listSecteurId, String name, int hauteurVoie, int nombreLongueurs) {
        this.setlistSecteurId(listSecteurId);
        this.setName( name );
        this.setHauteurVoie( hauteurVoie );
        this.setNombreLongueurs( nombreLongueurs );
    }

    private void setlistSecteurId(List listSecteurId) {
    }


    public List getListSecteurId() {
        return listSecteurId;
    }

    public void setListSecteurId(List listSecteurId) {
        this.listSecteurId=listSecteurId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getHauteurVoie() {
        return hauteurVoie;
    }

    public void setHauteurVoie(int hauteurVoie) {
        this.hauteurVoie=hauteurVoie;
    }

    public int getNombreLongueurs() {
        return nombreLongueurs;
    }

    public void setNombreLongueurs(int nombreLongueurs) {
        this.nombreLongueurs=nombreLongueurs;
    }
}
