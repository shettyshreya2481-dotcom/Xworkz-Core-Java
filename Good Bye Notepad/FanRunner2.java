class FanRunner2{
public static void main(String[] args){
Capacitor capacitor=new Capacitor();

capacitor.setCapacitorId("24");
capacitor.setCapacitorCapacity("23Mps");

Fan fan=new Fan(capacitor,"LNT");

System.out.println("Name OF Fan:"+fan.name);

fan.capacitorOn(capacitor);
fan.getInfo();
}}