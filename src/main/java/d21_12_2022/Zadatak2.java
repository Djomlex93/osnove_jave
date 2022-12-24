package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi= new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, 
//                iz niza, broji koliko je parnih brojeva uneto. brojeve unosi
//        korisnik.
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int parniBrojevi=0;

        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite broj: ");
            int broj=s.nextInt();
            brojevi.add(broj);
            if (broj%2==0){
                parniBrojevi=parniBrojevi + 1;
            }
            
        }
        System.out.println("Broj parnih brojeva je: " + parniBrojevi);

    }
}
