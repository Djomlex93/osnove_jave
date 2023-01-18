package d17_01_2023;

public class VideoPlayer {
    //    4. Zadatak
//    Kreirati klasu VideoPlayer koja ima:
//    duzinu videa
//    trenutno vreme videa
//    jacinu zvuka
//    Kvalitet videa (144, 240, 360, 480, 720, 1080)
//    gettere, settere i konstruktore


    private int duzina;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private double kvalitet;

    public VideoPlayer(int duzina, int trenutnoVreme, int jacinaZvuka, double kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public double getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(double kvalitet) {
        this.kvalitet = kvalitet;
    }
    //    metodu stampaj koja stampa podatke u formatu:
//    trenutno vreme videa
//    jacina zvuka
//    kavlitet videa
    public void stampaj(){
        System.out.println(this.trenutnoVreme);
        System.out.println(this.jacinaZvuka);
        System.out.println(this.kvalitet);
    }
}
