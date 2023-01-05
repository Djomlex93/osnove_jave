package d29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//                vratiCenuSaPopustom - koja kao ulazni parametar
//                funkcije dobija popust, a povratnu vrednost je cena proizvoda kada
//                se uračuna popust.Ova funkcije ne menja atribut cena.
//                Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za
//        svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod jafa = new Proizvod("Jafa", 150, 150);

        Proizvod cokolada = new Proizvod("Cokolada", 300, 300);

        jafa.stampaj();
        cokolada.stampaj();

        System.out.println("Cena proizvoda 1 sa popustom od 10%: " + jafa.vratiCenuSaPopustom(10));
        System.out.println("Cena proizvoda 2 sa popustom od 5%: " + cokolada.vratiCenuSaPopustom(5));

        System.out.println("Postarina za proizvod 1: " + jafa.racunajPostarinu());
        System.out.println("Postarina za proizvod 2: " + cokolada.racunajPostarinu());

    }
}
