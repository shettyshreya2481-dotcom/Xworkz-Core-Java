class CompetitiveExamsRunner {
    public static void main(String[] args) {

        CompetitiveExams exams = new CompetitiveExams();

        exams.addExam("UPSC Civil Services");
        exams.addExam("SSC CGL");
        exams.addExam("SSC CHSL");
        exams.addExam("IBPS PO");
        exams.addExam("IBPS Clerk");
        exams.addExam("RRB NTPC");
        exams.addExam("RRB Group D");
        exams.addExam("State PSC (KPSC)");
        exams.addExam("NDA");

        exams.displayExams();
    }
}
