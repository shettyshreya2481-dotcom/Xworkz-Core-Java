class Map{


String name;
String locationName;

Location location;

Map(){
}

Map(String name,String locationName){
this.name=name;
this.locationName=locationName;
}

public boolean createMap(Location location){
boolean isValid=false;

if(location!=null){
this.location=location;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Name:"+location.getName());
System.out.println("Location:"+location.getLocation());
}}