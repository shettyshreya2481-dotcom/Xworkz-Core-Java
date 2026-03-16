class Application {

    String appName;
    double version;

    Application(String appName, double version) {
        this.appName = appName;
        this.version = version;
    }

    void display() {
        System.out.println(appName + " Version: " + version);
    }
}