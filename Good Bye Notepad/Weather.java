class Weather{

Climate climate;

String weatherCondition;
String weatherDegree;

Weather(){

}

Weather(String weatherCondition,String weatherDegree){
this.weatherCondition=weatherCondition;
this.weatherDegree=weatherDegree;
}

public boolean createInfo(Climate climate){
boolean isvalid=false;
 if(climate!=null){
 this.climate=climate;
 isvalid=true;
 }
 
 return isvalid;
 }
 
 public void getInfo(){
 System.out.println("Climate Season:"+climate.getClimate());
 System.out.println("Climate Degree:"+climate.getClimateDegree());
 }}