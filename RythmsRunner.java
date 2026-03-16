public class RythmsRunner {

    public static void main(String[] args) {

        MusicInstrument m1 = new MusicInstrument("Guitar","String");
        Rythms r1 = new Rythms("RockBand", m1);

        MusicInstrument m2 = new MusicInstrument("Drum","Percussion");
        Rythms r2 = new Rythms("JazzBand", m2);

        r1.display();
        r2.display();
    }
}