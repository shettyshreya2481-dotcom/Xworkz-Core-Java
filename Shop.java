class Shop{
String name;
String[] products;
int shopId;

public Shop(String name,String[] products,int shopId){
this.name=name;
this.products=products;
this.shopId=shopId;
}

void display(){
System.out.println("Name Of the Shop:"+this.name);
for(String product:this.products)System.out.println("Products:"+product);
System.out.println("Shop Id:"+shopId);
}}
