class PeriodicTable {

    int groupNumber;
    Element element;

    PeriodicTable(int groupNumber, Element element) {
        this.groupNumber = groupNumber;
        this.element = element;
    }

    void display() {
        System.out.println("Group: " + groupNumber);
        element.display();
    }
}