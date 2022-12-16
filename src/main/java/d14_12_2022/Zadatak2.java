package d14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2)
//        Ukoliko se za b unese:
//        b=1, vrednost promenljive a se uvecava za 10
//        b=2, vrednost promenljive a se smanjuje za 20
//        Na kraju zadatka odstampati novu vrednost promenljive a.
        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        if(b==1){
            System.out.println("Nova vrednost za a je "+ (a + 10));
        }
        if(b==2){
            System.out.println("Nova vrednost za a je " + (a - 20));

        }


    }
}
