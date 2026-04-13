class FanRunner3{
public static void main(String[] args){
	Capacitor capacitor=new Capacitor();
	capacitor.setCapacitorId("23");
	capacitor.setCapacitorCapacity("23Mps");
	
	Fan fan=new Fan();
	
	fan.capacitorOn(capacitor);
	fan.getInfo();
}}