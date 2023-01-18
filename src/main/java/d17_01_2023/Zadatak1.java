package d17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {


//    U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.

        VideoPlayer aiwa = new VideoPlayer(850,120,15,360);
        TimeControl t = new TimeControl(true);
        AudioControl a = new AudioControl(false);
        QualityOptimizerControl q = new QualityOptimizerControl(65);

        aiwa.stampaj();
        System.out.println();

        t.izvrsiAkciju(aiwa);
        a.izvrsiAkciju(aiwa);
        q.izvrsiAkciju(aiwa);

        aiwa.stampaj();

    }
}