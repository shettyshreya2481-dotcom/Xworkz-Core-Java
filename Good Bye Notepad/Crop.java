class Crop{

Season season;

String cropName;
String cropRate;

Crop(){

}

Crop(String cropName,String cropRate){
this.cropName=cropName;
this.cropRate=cropRate;
}

public boolean createInfo(Season season){
boolean isValid=false;

if(season!=null){
this.season=season;
isValid=true;
}
return isValid;
}

public void getInfo(){
System.out.println("Season:"+season.getSeasonName());
}}

