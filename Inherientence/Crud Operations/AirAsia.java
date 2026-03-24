class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger){
        boolean isValid = false;

        if(passenger != null && !passenger.isEmpty()){
            if(index < passengers.length){
                passengers[index] = passenger;
                index++;
                isValid = true;
            } else {
                System.out.println("Flight is full");
            }
        } else {
            System.out.println(passenger + " Not Valid");
        }

        return isValid;
    }

    public void displayPassengers(){
        System.out.println("\n--- Passenger List ---");
        for(String passenger : passengers){
            if(passenger != null){
                System.out.println(passenger);
            }
        }
    }
}