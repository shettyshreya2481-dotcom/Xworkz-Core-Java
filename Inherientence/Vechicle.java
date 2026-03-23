class Vechicle{
String brand;
String modelNumber;
int speed;

Vechicle(String brand,String modelNumber,int speed){
this.brand=brand;
this.modelNumber=modelNumber;
this.speed=speed;
}

void getDetails(){
System.out.println("Brand Name:"+brand);
System.out.println("Model Number:"+modelNumber);
System.out.println("Speed:"+speed);
}}
