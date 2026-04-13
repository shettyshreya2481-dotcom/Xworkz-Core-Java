class Garden{
Flower flower;

String gardenName;
String Location;

Garden(String gardenName,String location){
this.gardenName=gardenName;
this.location=location;
}

public boolean createInfo(Garden garden){
 boolean isValid=false;
 
 if(garden!=null){
 this.garden=garden;
 isValid=true;
 }
 
 return isValid;
 }
 
 public void getInfo(){
 System.out.println("Name:"+getName);
 System.out.println("Location:"+getLocation);
 }}

