class FoodStreet{

Stall stall;
 
String streetName;
String streetLocation;

FoodStreet(){

}

FoodStreet(String streetName,String streetLocation){
this.streetLocation=streetLocation;
this.streetName=streetName;
}

public boolean createInfo(Stall stall){
boolean isValid=false;

if(stall!=null){
this.stall=stall;
isValid=true;
}

return isValid;
}



public void getInfo(){
System.out..println("Stall Name:"+stall.getStallName());
System.out.println("Stall Location:"+stall.getStallLocation());
}}
