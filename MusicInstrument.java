class MusicInstrument {

    String name;
    String type;

    MusicInstrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Instrument: " + name);
        System.out.println("Type: " + type);
    }
}