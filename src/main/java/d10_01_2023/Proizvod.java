package d10_01_2023;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cena;

    public Proizvod(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double cenaProizvoda() {
        double cena = this.cena * 1.9 * (100 - this.kupac.getKartica().getPopust()) / 100;
        return cena;
    }

    public void stampaj(){
        System.out.println("Naziv proizvoda: "+this.naziv+" - Cena je: "+this.cenaProizvoda());
        System.out.println("Ime i prezime kupca: "+this.kupac.getImeIPrezime()+" Broj kartice: "+this.kupac.getKartica().getBrojKartice());
    }
}