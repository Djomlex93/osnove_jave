package p13_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String imeIPrezime = "Mladen Dimitrijevic";
        String brojTelefona = "0648107965";
        String ulicaIBroj = "Kralja Milutina 6";
        String grad = "Nis";
        String email = "mladendimitrijevic93@gmail.com";

        System.out.println(imeIPrezime);
        System.out.println(brojTelefona + ", " + ulicaIBroj + ", " + grad);
        System.out.println(email);
    }


}
