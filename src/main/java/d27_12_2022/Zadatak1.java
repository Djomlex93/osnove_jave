package d27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

        Proizvod proizvod1 = new Proizvod("Hrana za pse", 300.0, 10.0);
        proizvod1.stampaj();

        double tezinaKG = proizvod1.konvertuj("kg");
        System.out.println("Tezina u kg: " + tezinaKG);

        double tezinaT = proizvod1.konvertuj("t");
        System.out.println("Tezina u t: " + tezinaT);

        System.out.println();

        Proizvod proizvod2 = new Proizvod("Laptop", 30000.0, 2500.0);
        proizvod2.stampaj();

        tezinaKG = proizvod2.konvertuj("kg");
        System.out.println("Tezina u kg: " + tezinaKG);

        tezinaT = proizvod2.konvertuj("t");
        System.out.println("Tezina u t: " + tezinaT);

    }

    }

