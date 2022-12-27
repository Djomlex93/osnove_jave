package d26_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao
//        parametre metode.Metoda nista ne vraca.
        podaciKorisnika("1308993733510", "Mladen", "Dimitrijevic"
        , 1993, false);

    }public static void podaciKorisnika(String jmbg, String ime, String prezime
    ,int godRodjenja, boolean jeAktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("God. rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + jeAktivan);
    }
}
