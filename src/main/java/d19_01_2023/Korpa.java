package d19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza>ambalaze;

    public Korpa() {
        super();
        this.ambalaze=new ArrayList<>();
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);

    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if(this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }

        }
    }
    private double cenaSvihAmbalaza(double popust){
        double suma=0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma=suma+this.ambalaze.get(i).cenaArtikla();

        }return suma- popust;

    }


    public double ukupnaCena(SuperKartica popust){
       return cenaSvihAmbalaza(popust.getPopust());
    }

}
