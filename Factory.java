class Factory {

    String factoryName;
    Machine machine;

    Factory(String factoryName, Machine machine) {
        this.factoryName = factoryName;
        this.machine = machine;
    }

    void display() {
        System.out.println("Factory: " + factoryName);
        machine.display();
    }
}