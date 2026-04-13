class FreeBusTravel{

String busType;

Adhar adhar;

FreeBusTravel(){

}

FreeBusTravel(String busType){
this.busType=busType;
}

public boolean createInfo(Adhar adhar){
boolean isValid=false;

if(adhar!=null){
this.adhar=adhar;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Adhhar Card:"+adhar.getAdhar());
}}