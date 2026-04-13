class Fan{
Capacitor capacitor;
String name;

Fan(){
}

Fan(Capacitor capacitor,String name){
this.name=name;
this.capacitor=capacitor;
}

public boolean capacitorOn(Capacitor capacitor){
boolean isValid=false;

if(capacitor!=null){
this.capacitor=capacitor;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Capacitor:"+capacitor.getCapacitorId());
System.out.println("Capacitor Capacity:"+capacitor.getCapacitorCapacity());
}}
