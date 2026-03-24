class TravelAgencyRunner {
    public static void main(String[] args) {

        TravelAgency travel = new TravelAgency();

        travel.addPlace("Goa");
        travel.addPlace("Mysuru");
        travel.addPlace("Ooty");
        travel.addPlace("Manali");
        travel.addPlace("Shimla");
        travel.addPlace("Kashmir");
        travel.addPlace("Jaipur");
        travel.addPlace("Udaipur");
        travel.addPlace("Kerala");
        travel.addPlace("Andaman Islands");
        travel.addPlace("Ladakh");
        travel.addPlace("Coorg");
        travel.addPlace("Chikmagalur");
        travel.addPlace("Darjeeling");
        travel.addPlace("Rishikesh");
        travel.addPlace("Varanasi");
        travel.addPlace("Agra");

        travel.displayPlaces();
    }
}