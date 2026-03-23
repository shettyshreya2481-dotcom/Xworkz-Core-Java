class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}