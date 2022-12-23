package d19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje speak loud programa.
//        Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako
//        da zadovolji uslov:
//        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji
//        (u procentima). Svaka uneta rec sa ! utice na agresivnost.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = s.nextInt();

        int agresivneReci = 0;


        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite rec: ");
            String rec = s.next();

            if (rec.contains("!")) {
                System.out.println(rec);
                agresivneReci= agresivneReci + 1;


            } else {
                System.out.println(rec + "!");
            }
        }

            int agresivnost= agresivneReci *100 / n;
        System.out.println(agresivnost +"%");


    }
}
