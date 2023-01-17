package d16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        1.Zadatak

//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

        Igrac a = new Igrac("Pera","218431",1993,13
        ,"Spic",true);
        Igrac b = new Igrac("Miki","4545640",1989,6,
                "Bek",false);
        Trener m = new Trener("Joca","4564650",1984,10,
                "Kondicioni");
        Trener n = new Trener("Fica", "4563218",1978,12,
                "Personalni");

        a.stampaj();
        b.stampaj();
        System.out.println();
        m.stampaj();
        n.stampaj();

    }
}
