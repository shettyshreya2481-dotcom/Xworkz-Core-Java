class PlayStore {

    String storeName;
    Application application;

    PlayStore(String storeName, Application application) {
        this.storeName = storeName;
        this.application = application;
    }

    void display() {
        System.out.println("Store: " + storeName);
        application.display();
    }
}