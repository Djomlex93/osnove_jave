package d13_01_2023;

import java.util.ArrayList;

public class Student {
    //        Napisati klasu Student koja ima
//        broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
    private String brojIndexa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit>ispiti;

    public Student(String brojIndexa, String imeIPrezime, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    //        metodu dodaj ispit u niz ispita
    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    public double prosek(){
        double ocene=0;
        int brojacIspita=0;
        double prosek = 0;
        for (int i = 0; i <this.ispiti.size() ; i++) {
            if (this.ispiti.get(i).jePolozio()==true){
                brojacIspita++;
                ocene = ocene + this.ispiti.get(i).getOcena();
            }
        } prosek = ocene/brojacIspita;
        return prosek;
        
    }
    //
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//                (naziv predmeta) - (profesor) - (ocena)
//                (naziv predmeta) - (profesor) - (ocena)
//                Prosecna ocena: (prosecna ocena)
    public void print(){
        System.out.println(this.brojIndexa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNazivPredmeta()
            +" - " + this.ispiti.get(i).getImeIPrezimeProf()
            +" - " + this.ispiti.get(i).getOcena());
            
        }
        System.out.println("Prosek je: " + this.prosek());
    }


}
