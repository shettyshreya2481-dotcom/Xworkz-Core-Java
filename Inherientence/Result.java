class Result extends Student {

    Result(String name, int marks) {
        super(name, marks);
    }

    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}