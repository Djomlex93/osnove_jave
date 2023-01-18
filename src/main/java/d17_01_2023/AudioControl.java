package d17_01_2023;

public class AudioControl extends Control {
    //
//    Kreirati klasu AudioControl koja nasledjuje klasu Control i
//    gettere, settere i konstruktore
//    ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)

    private boolean pojacajZvuk;

    public AudioControl(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }
    public AudioControl(){

    }

    public boolean isPojacajZvuk() {
        return pojacajZvuk;
    }

    public void setPojacajZvuk(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }
    //    implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
//    U opsegu od 0 do 100

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (pojacajZvuk==true){
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka()+1);
        }else{
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka()-1);
        } if (videoPlayer.getJacinaZvuka()<0){
            videoPlayer.setJacinaZvuka(0);
        }else if (videoPlayer.getJacinaZvuka()>100){
            videoPlayer.setJacinaZvuka(100);
        }
    }
}
