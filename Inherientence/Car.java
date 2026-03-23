class Car extends Vechicle{
	int doors;
	Car(String brand,String modelNumber,int speed ,int doors){
		super(brand,modelNumber,speed);
		this.doors=doors;
	}
void getDisplay(){
System.out.println("Doors:"+doors);
System.out.println("Car is a Child Class");
}}