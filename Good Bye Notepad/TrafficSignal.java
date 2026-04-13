class TrafficSignal{
String trafficPoint;
String location;

Cop cop;


public TrafficSignal(){

}

TrafficSignal(String trafficPoint,String location){
this.trafficPoint=trafficPoint;
this.location=location;
}

public boolean createInfo(Cop cop){
boolean isValid=false;

if(cop!=null){
this.cop=cop;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Cop Name:"+cop.getCopName());
System.out.println("Cop Id:"+cop.getCopId());
}}