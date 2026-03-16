public class PlayStoreRunner {

    public static void main(String[] args) {

        Application a1 = new Application("Instagram",1.2);
        PlayStore p1 = new PlayStore("Google Play", a1);

        Application a2 = new Application("WhatsApp",2.3);
        PlayStore p2 = new PlayStore("Google Play", a2);

        p1.display();
        p2.display();
    }
}