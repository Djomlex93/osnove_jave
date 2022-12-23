package d19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
//        Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//                smile
//        heart
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int like=0;
        int smile=0;
        int heart=0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Unesi reakciju: ");
            String reakcija = s.next();
            if (reakcija.equals("like")){
                like=like + 1;
            }if (reakcija.equals("smile")){
                smile = smile +1;
            }if (reakcija.equals("heart")){
                heart = heart +1;
            }
        }
            System.out.println("Summary: like "+ like +" | smile "
                    + smile+" | heart "+ heart);
        }

    }

