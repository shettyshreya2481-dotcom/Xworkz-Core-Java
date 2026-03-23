class Mall{
Shop shop;
String mallName;
String location;

Mall(){

}
public Mall(String mallName,String location,Shop shop){
this.shop=shop;
this.mallName=mallName;
this.location=location;
}

void getDetails(){
	shop.display();
	System.out.println("Mall Name:"+this.mallName);
	System.out.println("location:"+this.location);
}}