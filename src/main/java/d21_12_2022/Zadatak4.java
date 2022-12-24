package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

//        . Napisati program koji ucitava niz A duzine N i broj X.
//                Nakon unosa treba ispisati indekse onih clanova niza koji
//        su jednaki broju X.

        System.out.println("Unesite n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);

        }
        System.out.println("Unesite x: ");
        int x = s.nextInt();
        System.out.println("Elementi niza koji su jednaki broju x su: ");

        for (int i = 0; i < a.size(); i++) {
            a.get(i);

            if (a.get(i)==x){
                System.out.print(i + ", ");
            }
            
        }

    }
}
