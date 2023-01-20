package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    @Override
    public double cenaArtikla() {
        if (daLiSePlacaKaucija==true){
            return (this.osnovnaCena*1.2) + this.kaucija;
        }else return this.osnovnaCena*1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: "+this.barkod);
        System.out.println("Naziv: "+ this.naziv);
        System.out.println("Neto tezina: " + this.netoTezina);
        System.out.println("Bruto tezina: "+ this.brutoTezina);
        System.out.println("Da li se placa kaucija: " + this.daLiSePlacaKaucija);
        System.out.println("Kaucija: " + this.kaucija);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}
