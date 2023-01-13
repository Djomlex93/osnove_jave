package d12_01_2023;

public class ZeleniKarton {
    private String imeIPrezime;
    private int brojIndexa;
    private String nazivPredmeta;
    private String imeIPrezimeProf;
    private int ocena;

    public ZeleniKarton(String imeIPrezime, int brojIndexa, String imeIPrezimeProf) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndexa = brojIndexa;
        this.imeIPrezimeProf = imeIPrezimeProf;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIPrezimeProf() {
        return imeIPrezimeProf;
    }

    public void setImeIPrezimeProf(String imeIPrezimeProf) {
        this.imeIPrezimeProf = imeIPrezimeProf;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean jePolozio(){
        if (this.ocena>5&&this.ocena<=10){
            return true;
        }else{
            return false;
        }
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: "+ this.imeIPrezime + ", "+this.brojIndexa);
        System.out.println("Profesor: " + this.imeIPrezimeProf);
        System.out.println();
    }
}
