class InteriorDesign {
    private String designs[] = new String[11];
    int index;

    public boolean addDesign(String design){
        boolean isValid = false;

        if(design != null && !design.isEmpty()){
            if(index < designs.length){
                designs[index] = design;
                index++;
                isValid = true;
            } else {
                System.out.println("Design list is full");
            }
        } else {
            System.out.println(design + " Not Valid");
        }

        return isValid;
    }

    public void displayDesigns(){
        System.out.println("\n--- Interior Design List ---");
        for(String design : designs){
            if(design != null){
                System.out.println(design);
            }
        }
    }
}