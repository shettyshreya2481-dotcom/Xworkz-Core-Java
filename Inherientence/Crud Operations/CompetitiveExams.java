class CompetitiveExams {
    private String exams[] = new String[9];
    int index;

    public boolean addExam(String exam){
        boolean isValid = false;

        if(exam != null && !exam.isEmpty()){
            if(index < exams.length){
                exams[index] = exam;
                index++;
                isValid = true;
            } else {
                System.out.println("Exam list is full");
            }
        } else {
            System.out.println(exam + " Not Valid");
        }

        return isValid;
    }

    public void displayExams(){
        System.out.println("\n--- Government Competitive Exams ---");
        for(String exam : exams){
            if(exam != null){
                System.out.println(exam);
            }
        }
    }
}