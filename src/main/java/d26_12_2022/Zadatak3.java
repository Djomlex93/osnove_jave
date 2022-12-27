package d26_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni
//        parametri funkcije vraca novu vrednost koja se formira kao na primeru.
//                METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost x: ");
        int x = s.nextInt();
        System.out.println("Unesite vrednost y: ");
        int y = s.nextInt();
        System.out.println(brojevi(x,y));

    }
    public static int brojevi(int a, int b){
        int c = a *10 + b;
        return c;
    }
}
