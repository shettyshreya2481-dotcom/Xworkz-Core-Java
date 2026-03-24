class StateHighwayRunner {
    public static void main(String[] args) {

        StateHighway sh = new StateHighway();

        sh.addHighway("SH-1 Bengaluru to Mysuru");
        sh.addHighway("SH-9 Bengaluru to Hosur");
        sh.addHighway("SH-17 Mysuru to Madikeri");
        sh.addHighway("SH-27 Bengaluru to Mangaluru");
        sh.addHighway("SH-47 Bellary to Hubballi");
        sh.addHighway("SH-57 Shivamogga to Chikkamagaluru");
        sh.addHighway("SH-65 Bengaluru to Gubbi");
        sh.addHighway("SH-75 Mangaluru to Bengaluru");
        sh.addHighway("SH-88 Mysuru to Kushalnagar");

        sh.displayHighways();
    }
}