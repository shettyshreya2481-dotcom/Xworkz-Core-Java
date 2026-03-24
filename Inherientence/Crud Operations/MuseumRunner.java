class MuseumRunner {
    public static void main(String[] args) {

        Museum museum = new Museum();

        museum.addMonument("Taj Mahal");
        museum.addMonument("Qutub Minar");
        museum.addMonument("Red Fort");
        museum.addMonument("Hampi Ruins");
        museum.addMonument("Mysore Palace");
        museum.addMonument("Gateway of India");
        museum.addMonument("India Gate");
        museum.addMonument("Charminar");
        museum.addMonument("Ajanta Caves");
        museum.addMonument("Ellora Caves");
        museum.addMonument("Konark Sun Temple");
        museum.addMonument("Khajuraho Temples");
        museum.addMonument("Golden Temple");
        museum.addMonument("Sanchi Stupa");
        museum.addMonument("Victoria Memorial");
        museum.addMonument("Gol Gumbaz");

        museum.displayMonuments();
    }
}