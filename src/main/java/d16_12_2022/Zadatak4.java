package d16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji ucitava dimenziju table i stampa je na ekranu.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju: ");
        int dimenzija = s.nextInt();

        for (int i = 1; i <= dimenzija; i++) {
            System.out.println();

            for (int p = 1; p <= dimenzija; p++) {

                System.out.print("_|");

            }


        }
    }
}
