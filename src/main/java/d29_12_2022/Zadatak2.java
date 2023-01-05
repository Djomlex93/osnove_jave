package d29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {


        FacebookPost prvi = new FacebookPost("Petar", "Petrovic", "Jovan",
                "Jovanovic", "Srecan rodjendan");
        FacebookPost drugi = new FacebookPost("Jovan", "Jovanovic",
                "Petar", "" +
                "Petrovic", "Hvala");
        prvi.lajk();
        prvi.lajk();
        prvi.share();
        prvi.lajk();
        drugi.lajk();
        drugi.lajk();
        drugi.share();
        drugi.share();
        drugi.lajk();
        drugi.dislike();

        prvi.print();
        drugi.print();
    }

}
