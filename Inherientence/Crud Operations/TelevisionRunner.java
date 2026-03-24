class TelevisionRunner {
    public static void main(String[] args) {

        Television tv = new Television();

        tv.addChannel("Star Plus");
        tv.addChannel("Colors TV");
        tv.addChannel("Zee TV");
        tv.addChannel("Sony TV");
        tv.addChannel("Sun TV");
        tv.addChannel("Udaya TV");
        tv.addChannel("Star Sports");
        tv.addChannel("Sony Sports");
        tv.addChannel("Discovery Channel");
        tv.addChannel("National Geographic");
        tv.addChannel("Animal Planet");
        tv.addChannel("Cartoon Network");
        tv.addChannel("Pogo");
        tv.addChannel("Nickelodeon");
        tv.addChannel("DD National");
        tv.addChannel("DD News");
        tv.addChannel("TV9");
        tv.addChannel("Public TV");
        tv.addChannel("News18");
        tv.addChannel("Asianet");

        tv.displayChannels();
    }
}