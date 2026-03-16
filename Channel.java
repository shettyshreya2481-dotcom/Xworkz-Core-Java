class Channel {

    String channelName;
    String language;

    Channel(String channelName, String language) {
        this.channelName = channelName;
        this.language = language;
    }

    void display() {
        System.out.println(channelName + " " + language);
    }
}