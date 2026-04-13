class Prison{

String prisonId;

Criminal criminal;

Prison(){

}

Prison(String prisonId){
this.prisonId=prisonId;
}

public boolean createInfo(Criminal criminal){
boolean isvalid=false;

if(criminal!=null){
this.criminal=criminal;
isvalid=true;
}

return isvalid;
}

public void getInfo(){
System.out.println("Criminal Name:"+criminal.getCriminalName());
System.out.println("Criminal Id:"+criminal.getCriminalId());
}}