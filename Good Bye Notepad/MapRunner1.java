class MapRunner1{
public static void main(String[] args){
   
  
   
 Location location= new Location();
 location.setName("Google Map");
 location.setLocation("Mumbai");                          //
 
    Map map=new Map();
	
 map.createMap(location);
 
 map.getInfo();
 }}