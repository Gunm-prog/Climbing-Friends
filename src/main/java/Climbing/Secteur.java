package Climbing;

import java.util.List;

public class Secteur {


    private boolean typeRocher;
    private String localisation;
    private int height;
    private List listVoieId;

    public Secteur (boolean typeRocher, String localisation, int height, List listVoieId){
        this.typeRocher=typeRocher;
        this.localisation=localisation;
        this.height=height;
        this.listVoieId=listVoieId;
    }



    public boolean isTypeRocher() { return typeRocher; }

    public void setTypeRocher(boolean typeRocher) { this.typeRocher=typeRocher; }

    public String getLocalisation() { return localisation; }

    public void setLocalisation(String localisation) { this.localisation=localisation; }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height=height; }

    public List getListVoieId() {
        return listVoieId;
    }

    public void setListVoieId(List listVoieId) {
        this.listVoieId=listVoieId;
    }
}
