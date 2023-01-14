package d13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Ispit a = new Ispit("Istorija",9,"Janko");
        Ispit b = new Ispit("Geografija",6,"Marko");
        Ispit c = new Ispit("Biologija",5,"Stanko");
        Student m = new Student("43343","Pera Peric","master");

        m.dodajIspit(a);
        m.dodajIspit(b);
        m.dodajIspit(c);

        a.stampaj();
        System.out.println();

        m.print();







    }
}
