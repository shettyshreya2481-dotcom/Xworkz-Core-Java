class IceCream{

String iceCream;

Flavour flavour;

IceCream(){

}

IceCream(String iceCream){
this.iceCream=iceCream;
}

public boolean createInfo(Flavour flavour){
boolean isValid=false;

if(flavour!=null){
this.flavour=flavour;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Flavour Name:"+flavour.getFlavourName());
}}