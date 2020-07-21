package Entities;

import java.util.List;

public class Longueur  {

    private List listVoieId;
    private float distance;
    private int points;
    private String cotation;


    public Longueur(List listVoieId, float distance, int points, String cotation) {
        this.setListVoieId(listVoieId);
        this.setDistance( distance );
        this.setPoints( points );
        this.setCotation( cotation );
    }

    private void setListVoieId(List listVoieId) {
    }


    public List getListVoieId(){ return listVoieId;}



    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance=distance;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points=points;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation=cotation;
    }
}
