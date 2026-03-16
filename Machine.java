class Machine {

    String machineName;
    int machineId;

    Machine(String machineName, int machineId) {
        this.machineName = machineName;
        this.machineId = machineId;
    }

    void display() {
        System.out.println(machineName + " " + machineId);
    }
}