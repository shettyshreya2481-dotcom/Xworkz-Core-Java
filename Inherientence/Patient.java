class Patient {
    String name;
    int days;

    Patient(String name, int days) {
        this.name = name;
        this.days = days;
    }

    void displayPatient() {
        System.out.println("Patient Name: " + name);
        System.out.println("Days Admitted: " + days);
    }
}