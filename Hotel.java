class Hotel{
String name;
String location;
Floor floor;
String[] branches;

public Hotel(String name,String location,Floor floor,String[] branches){
this.name=name;
this.location=location;
this.floor=floor;
this.branches=branches;

}

void getDetails(){
floor.display();

for(String branch:this.branches){
	System.out.println("Our Branch:"+branch);
}
System.out.println("Name:"+name);
System.out.println("Location:"+location);
}}