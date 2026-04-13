class  IceCreamRunner3{
public static void main(String[] args){
Flavour flavour=new Flavour();
flavour.setFlavourName("Vanilla");


IceCream ice=new IceCream();
ice.createInfo(flavour);
ice.getInfo();
}}