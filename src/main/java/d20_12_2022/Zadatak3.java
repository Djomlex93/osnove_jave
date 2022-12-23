package d20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava brojeve
//        sve dok ne unesu bar dve dvojke ili tri jedinice.

        int broj = 0;
        int counter1 = 0;
        int counter2 = 0;

        while (counter1 != 2 && counter2 != 3) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 2) {
                counter1++;

            }
            if (broj == 1) {
                counter2++;
            }
        }
        System.out.println("Kraj programa");
    }
}
