package d19_01_2023;

public class Tetrapak extends Ambalaza{
    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public Tetrapak() {
    }

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {

        if(this.daLiSeReciklira==true){
          return (tezinaPakovanja()*1.5)+this.osnovnaCena;

        }else return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: "+this.barkod);
        System.out.println("Naziv: "+ this.naziv);
        System.out.println("Neto tezina: " + this.netoTezina);
        System.out.println("Bruto tezina: "+ this.brutoTezina);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Da li se reciklira: "+this.daLiSeReciklira);
    }
}
