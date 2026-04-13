class FoodStreetRunner3{
public static void main(String[] args){
Stall stall=new Stall();
stall.setStallName("Chow Chow");
stall.setStallLocation("kuvempu");

FoodStreet food=new FoosStreet();
food.createInfo(stall);
food.getInfo();
}}