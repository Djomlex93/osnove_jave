package d19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korpa k = new Korpa();
        Ambalaza a = new Tetrapak("4545-45","jogurt",45,
                85,true,89);
        Ambalaza b = new Tetrapak("4564-89","mleko",56,
                98,false,111);
        Ambalaza c = new StaklenaAmbalaza("1223-98","pivo",250,
                320,20,true,65);
        Ambalaza d = new StaklenaAmbalaza("1248-98","vino",400,
                520,50,false,300);

        SuperKartica s = new SuperKartica(225883,"Djomlex",100);

        k.dodajAmbalazu(a);
        k.dodajAmbalazu(b);
        k.dodajAmbalazu(c);
        k.dodajAmbalazu(d);

        k.izbaciAmbalazu("4545-45");

        b.stampaj();
        System.out.println();
        c.stampaj();
        System.out.println();
        s.stampajKarticu();
        System.out.println();
        System.out.println(b.cenaArtikla());
        System.out.println(c.cenaArtikla());
        System.out.println(d.cenaArtikla());

        for (int i = 0; i < k.getAmbalaze().size(); i++) {
            k.getAmbalaze().get(i).stampaj();
            System.out.println();
            
        }
        System.out.println();


        System.out.println("Ukupna cena je: "+ k.ukupnaCena(s));








    }
}
