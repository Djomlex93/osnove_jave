package d16_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {


//    (Za vezbanje)
//            2. Zadatak

//   U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
        Igrac2 a = new Igrac2("Mika Santic", "2123153135", 1993,
                10, "Spic", false);
        Karton k1 = new Karton("zuti");
        Karton k2 = new Karton("crveni");
        Karton k3 = new Karton("zuti");
        Karton k4 = new Karton("zuti");
        Karton k5 = new Karton("zuti");
        Karton k6 = new Karton("crveni");

        a.dodajKarton(k1);
        a.dodajKarton(k2);
        a.dodajKarton(k3);
        a.dodajKarton(k4);
        a.dodajKarton(k5);
        a.dodajKarton(k6);

        a.brojZutih();
        a.brojCrvenih();
        a.stampaj();




    }
}
