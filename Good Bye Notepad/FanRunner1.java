class FanRunner1{
public static void main(String[] args){

Capacitor capacitor=new Capacitor();

String ref1=capacitor.setCapacitorId("34");
System.out.println(ref1);

String ref2=capacitor.setCapacitorCapacity("23mps");
System.out.println(ref2);

Fan fan=new Fan();

fan.capacitorOn(capacitor);
fan.getInfo();

}}