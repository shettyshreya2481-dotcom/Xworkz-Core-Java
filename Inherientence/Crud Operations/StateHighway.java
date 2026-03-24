class StateHighway {
    private String highways[] = new String[9];
    int index;

    public boolean addHighway(String highway){
        boolean isValid = false;

        if(highway != null && !highway.isEmpty()){
            if(index < highways.length){
                highways[index] = highway;
                index++;
                isValid = true;
            } else {
                System.out.println("Highway list is full");
            }
        } else {
            System.out.println(highway + " Not Valid");
        }

        return isValid;
    }

    public void displayHighways(){
        System.out.println("\n--- State Highways List ---");
        for(String highway : highways){
            if(highway != null){
                System.out.println(highway);
            }
        }
    }
}