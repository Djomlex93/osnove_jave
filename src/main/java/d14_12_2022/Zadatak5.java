package d14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa
//        tastature (operator je string i moze imati vrednosti +, - , *, /) racuna
//        i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik
//        za dva broja a i b uneta sa tastature

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite operator: ");
        String operator = s.next();

        if(operator .equals("+")){
            System.out.println("Rezultat: " + (a+b));
        }if(operator.equals("-")){
            System.out.println("Rezultat: " + (a-b));
        }if(operator.equals("*")){
            System.out.println("Rezultat: " + (a*b));
        }if(operator.equals("/")){
            System.out.println("Rezultat: " + (a/b));
        }
    }
}
