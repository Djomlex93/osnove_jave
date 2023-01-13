package d12_01_2023;

public class Racun {
    private String broj;
    private String imeIPrezime;
    private double trenutnoStanje;

    public Racun(String broj, String imeIPrezime, double trenutnoStanje) {
        this.broj = broj;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje=trenutnoStanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public double stanje(double stanje) {
        this.trenutnoStanje = this.trenutnoStanje + stanje;
        if (this.trenutnoStanje < 0) {
            this.trenutnoStanje = 0;
            return trenutnoStanje;
        }
        return this.trenutnoStanje;
    }
//    } Ime i prezime  -  broj racuna
////        stanje na racunu je (trenutno stanje) rsd.

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.trenutnoStanje + " rsd");

    }



}
