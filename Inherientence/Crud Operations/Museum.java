class Museum {
    private String monuments[] = new String[16];
    int index;

    public boolean addMonument(String monument){
        boolean isValid = false;

        if(monument != null && !monument.isEmpty()){
            if(index < monuments.length){
                monuments[index] = monument;
                index++;
                isValid = true;
            } else {
                System.out.println("Monument list is full");
            }
        } else {
            System.out.println(monument + " Not Valid");
        }

        return isValid;
    }

    public void displayMonuments(){
        System.out.println("\n--- Historical Monuments List ---");
        for(String monument : monuments){
            if(monument != null){
                System.out.println(monument);
            }
        }
    }
}