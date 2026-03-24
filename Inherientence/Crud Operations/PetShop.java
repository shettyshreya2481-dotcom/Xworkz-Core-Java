class PetShop {
    private String accessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory){
        boolean isValid = false;

        if(accessory != null && !accessory.isEmpty()){
            if(index < accessories.length){
                accessories[index] = accessory;
                index++;
                isValid = true;
            } else {
                System.out.println("Accessory list is full");
            }
        } else {
            System.out.println(accessory + " Not Valid");
        }

        return isValid;
    }

    public void displayAccessories(){
        System.out.println("\n--- Pet Accessories List ---");
        for(String accessory : accessories){
            if(accessory != null){
                System.out.println(accessory);
            }
        }
    }
}