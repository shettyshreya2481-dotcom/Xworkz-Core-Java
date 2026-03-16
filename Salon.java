class Salon{
Service service;
String salonName;
String salonId;

public Salon(Service service,String salonName,String salonId){
this.service=service;
this.salonName=salonName;
this.salonId=salonId;
}

void getDetails(){
service.display();
System.out.println("Salon Name:"+this.salonName);
System.out.println("Salon Id:"+this.salonId);
}}