package d12_01_2023;

public class Transakcija {
    private String id;
    private Racun posaljilac;
    private Racun primalac;

    public Transakcija(String id, Racun posaljilac, Racun primalac) {
        this.id = id;
        this.posaljilac = posaljilac;
        this.primalac = primalac;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getPosaljilac() {
        return posaljilac;
    }

    public void setPosaljilac(Racun posaljilac) {
        this.posaljilac = posaljilac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
    private double provizija(double vrednostTransakcije){
        if (vrednostTransakcije<4500){
            return 45;
        }else{
            return vrednostTransakcije*1/100;
        }
    }
    public void izvrsiTransakciju(double x){
        double novoStanje = (x + provizija(x));
        this.posaljilac.stanje(-novoStanje);
        this.primalac.stanje(x);
    }
    public void print(){
        System.out.println(this.id);
        System.out.println("Racun sa: "+ this.posaljilac.getImeIPrezime()
                + " - " + this.posaljilac.getBroj());
        System.out.println("Racun na: " + this.primalac.getImeIPrezime()
        + " - " + this.primalac.getBroj());
    }

}
