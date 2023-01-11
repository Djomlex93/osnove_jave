package d10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Autor koja ima
//                -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//                -naziv
//                -godina izdanja
//                -autor
//                -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//                (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.


        Autor a = new Autor("Pera", "Peric");
        Knjiga m = new Knjiga("884-65-54-66-54", "osnove jave", 2008, a);

        m.stampaj();
        System.out.println();

        Autor b = new Autor("Mika","Santic");
        Knjiga n = new Knjiga("4564-454-546","plavi cuperak",1932,b);

        n.stampaj();


    }

}