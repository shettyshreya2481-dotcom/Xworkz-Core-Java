class Project {

    String projectName;
    int duration;

    Project(String projectName, int duration) {
        this.projectName = projectName;
        this.duration = duration;
    }

    void display() {
        System.out.println(projectName + " Duration: " + duration + " months");
    }
}