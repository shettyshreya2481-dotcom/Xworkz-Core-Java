class Garden{
Flower flower;

String gardenName;
String location;

Garden(){
	
}

Garden(String gardenName,String location){
this.gardenName=gardenName;
this.location=location;
}

public boolean createInfo(Flower flower){
 boolean isValid=false;
 
 if(flower!=null){
 this.flower=flower;
 isValid=true;
 }
 
 return isValid;
 }
 
 public void getInfo(){
 System.out.println("Name:"+flower.getFlowerName());
 System.out.println("Location:"+flower.getFlowerType());
 }}

