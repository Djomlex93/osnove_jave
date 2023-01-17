package d16_01_2023;

public class Trener extends Osoba{
    //        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase,
//        tako da stampa sve informacije o treneru.

    private int godIskustva;
    private String tip;

    public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godIskustva, String tip) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tip = tip;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva: "+ this.godIskustva);
        System.out.println("Tip trenera: " + this.tip);
    }
}
