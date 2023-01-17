package d16_01_2023;

import java.util.ArrayList;

public class Igrac2 extends Osoba2 {
    //    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju


    private int broj;
    private String pozicija;
    private boolean jeKapiten;
    ArrayList<Karton> kartoni;

    public Igrac2() {

    }

    public Igrac2(String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
        this.kartoni = new ArrayList<>();
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    //    metodu dodaj karton, gde se dodaje karton u niz
    public void dodajKarton(Karton karton) {
        this.kartoni.add(karton);
    }

    //    metodu koja vraca broj zutih kartona
    public int brojZutih() {
        int zuti = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")) {
                zuti = zuti + 1;
            }

        }
        return zuti;

    }

    //    metodu koja vraca broj crvenih kartona
    public int brojCrvenih() {
        int crveni = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                crveni = crveni + 1;
            }

        }
        return crveni;
    }
    //    metodu stampaj, koju prepisuje iz glavne klase,
//    tako da stampa sve informacije o igracu
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj je: " + this.broj);
        System.out.println("Kapiten: " + this.jeKapiten);
        System.out.println("Pozicija: " + this.pozicija);
        System.out.println("Broj zutih: " + brojZutih());
        System.out.println("Broj crvenih: " + brojCrvenih());

    }
}
