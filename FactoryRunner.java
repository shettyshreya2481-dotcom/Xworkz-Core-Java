public class FactoryRunner {

    public static void main(String[] args) {

        Machine m1 = new Machine("CuttingMachine",101);
        Factory f1 = new Factory("Tata Factory", m1);

        Machine m2 = new Machine("DrillingMachine",102);
        Factory f2 = new Factory("Reliance Factory", m2);

        f1.display();
        f2.display();
    }
}