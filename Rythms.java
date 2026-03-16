class Rythms {

    String bandName;
    MusicInstrument instrument;

    Rythms(String bandName, MusicInstrument instrument) {
        this.bandName = bandName;
        this.instrument = instrument;
    }

    void display() {
        System.out.println("Band: " + bandName);
        instrument.display();
        System.out.println("----------------");
    }
}