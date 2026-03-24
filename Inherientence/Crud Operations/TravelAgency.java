class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String place){
        boolean isValid = false;

        if(place != null && !place.isEmpty()){
            if(index < places.length){
                places[index] = place;
                index++;
                isValid = true;
            } else {
                System.out.println("Places list is full");
            }
        } else {
            System.out.println(place + " Not Valid");
        }

        return isValid;
    }

    public void displayPlaces(){
        System.out.println("\n--- Travel Destinations ---");
        for(String place : places){
            if(place != null){
                System.out.println(place);
            }
        }
    }
}