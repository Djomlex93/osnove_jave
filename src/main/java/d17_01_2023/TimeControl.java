package d17_01_2023;

public class TimeControl extends Control {
    //    Kreirati klasu TimeControl koja nasledjuje klasu Control i
//    konstruktore
//    ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)


    private boolean pomeriVideo;

    public TimeControl(boolean pomeriVideo) {
        this.pomeriVideo = pomeriVideo;
    }

    public TimeControl() {
    }
    //    implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa
//    za 15s unapred ili unazad u zavisnosti od atributa.
//    Veoma je bitno da se ne izadje van granica videa.


    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {

        if (pomeriVideo==true){
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme()+15);
        }else{
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme()-15);
        }
        if (videoPlayer.getTrenutnoVreme()> videoPlayer.getDuzina()){
            videoPlayer.setTrenutnoVreme(videoPlayer.getDuzina());
        }if (videoPlayer.getTrenutnoVreme()<0){
            videoPlayer.setTrenutnoVreme(0);
        }
    }
}
