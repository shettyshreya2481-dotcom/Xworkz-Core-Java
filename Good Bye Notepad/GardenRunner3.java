class GardenRunner3{
public static void main(String[] args){
Flower flower=new Flower();
flower.setFlowerName("Lilly");
flower.setFlowerType("magnus");

Garden garden=new Garden();
garden.createInfo(flower);
garden.getInfo();
}}