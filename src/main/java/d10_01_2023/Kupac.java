package d10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta kartica;

    public Kupac(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }

    public void setKartica(ClanskaKarta kartica) {
        this.kartica = kartica;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.kartica.getBrojKartice());
    }
}
