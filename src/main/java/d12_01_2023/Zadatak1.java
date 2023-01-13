package d12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Zadatak
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//                konstruktore
//        metodu koja vraca da li je ispit polozen ili ne
//        (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//                Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//                (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> niz = new ArrayList<ZeleniKarton>();

        for (int i = 0; i <10 ; i++) {
            ZeleniKarton m = new ZeleniKarton("Mihajlo Mihajlovic",
                    43343,"Milan i Vlada");
            System.out.println("Unesite predmet: ");
            String predmet = s.next();
            m.setNazivPredmeta(predmet);
            System.out.println("Unesite ocenu: ");
            int ocena = s.nextInt();
            m.setOcena(ocena);
            niz.add(m);

        }
        for (int i = 0; i < niz.size(); i++) {
            niz.get(i).stampaj();

        }
        double suma=0;
        for (int i = 0; i <10; i++) {
            suma=suma+niz.get(i).getOcena();
        }
        double prosek=suma/10;
        System.out.println("Prosek je: " + prosek);
    }

}
