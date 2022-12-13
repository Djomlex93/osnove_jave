package p13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]

        String sifraProizvoda = "x548l97";
        String nazivProizvoda = "Reebok Patike";
        double cena = 80;
        double popust = 10;
        String boja = "plava";
        double velicina = 46.5;

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda
                + " - $" + cena + ""
                + " - Popust "
                + popust + "%");
        System.out.println(boja + ", " + velicina);

    }
}
