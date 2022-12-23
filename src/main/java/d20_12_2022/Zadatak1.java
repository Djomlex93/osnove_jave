package d20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava brojeva od korisnika i za svaki broj
//        prikazuje apsolutnu vrednost sve dok se ne unese nula.

        System.out.println("Unesite broj ");
        int broj=s.nextInt();

        while (broj != 0) {
            if (broj>0){
                System.out.println("Apsolutna vrednost je " + broj);}
            else if (broj < 0) {
                System.out.println("Apsolutna vrednost je " + broj *(-1));

            }
            System.out.println("Unesite broj: ");
            broj=s.nextInt();
            }
        System.out.println("Kraj programa jer je uneta 0 ");
            }


        }


