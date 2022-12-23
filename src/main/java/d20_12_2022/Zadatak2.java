package d20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na
//        ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

        String rimskiBroj="";

        while (!rimskiBroj.equals("KRAJ")){
            System.out.println("Unesite rimski broj");
            rimskiBroj=s.next();
            if (rimskiBroj.equals("I")){
                System.out.println("Arapski br = " + 1);
            }else if (rimskiBroj.equals("V")){
                System.out.println("Arapski br = " + 5);
            }else if (rimskiBroj.equals("X")){
                System.out.println("Arapski br = " + 10);
            }else if (rimskiBroj.equals("L")){
                System.out.println("Arapski br = " + 50);
            }else if (rimskiBroj.equals("C")){
                System.out.println("Arapski br = " + 100);
            }else if (rimskiBroj.equals("D")){
                System.out.println("Arapski br = " + 500);
            }else if (rimskiBroj.equals("M")){
                System.out.println("Arapski br = " + 1000);
            }

        }

        System.out.println("Kraj programa");
    }
}
