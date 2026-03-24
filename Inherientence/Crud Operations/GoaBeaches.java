class GoaBeaches {
    private String beaches[] = new String[19];
    int index;

    public boolean addBeach(String beach){
        boolean isValid = false;

        if(beach != null && !beach.isEmpty()){
            if(index < beaches.length){
                beaches[index] = beach;
                index++;
                isValid = true;
            } else {
                System.out.println("Beach list is full");
            }
        } else {
            System.out.println(beach + " Not Valid");
        }

        return isValid;
    }

    public void displayBeaches(){
        System.out.println("\n--- Goa Beaches List ---");
        for(String beach : beaches){
            if(beach != null){
                System.out.println(beach);
            }
        }
    }
}