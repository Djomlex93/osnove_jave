package d17_01_2023;

public class QualityOptimizerControl extends Control {
    //    Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//    ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//    gettere, settere i konstruktore

    private int brzinaInterneta;

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
//    /    implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti
//    od brzine interneta. Kvalitet se racuna na osnovu formule:
//    brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//    npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//    npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//    npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet = this.brzinaInterneta*10.1;
        if (kvalitet<=144){
            videoPlayer.setKvalitet(144);
        }else if (kvalitet<=240){
            videoPlayer.setKvalitet(240);
        }else if (kvalitet<=720){
            videoPlayer.setKvalitet(720);
        }
    }
}