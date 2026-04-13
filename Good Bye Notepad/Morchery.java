class Morchery{

DeadBody body;

String morcheryName;

Morchery(){

}

Morchery(String morcheryName){
this.morcheryName=morcheryName;
}

public boolean createInfo(DeadBody body){
boolean isValid=false;

if(body!=null){
this.body=body;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("DeadBody:"+body.getDeadBodyName());
}}