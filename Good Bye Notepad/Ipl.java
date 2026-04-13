class  Ipl{

String teamName;

RCB rcb;

Ipl(){

}

Ipl(String teamName){
this.teamName=teamName;
}

public boolean createInfo(RCB rcb){
boolean isValid=false;

if(rcb!=null){
this.rcb=rcb;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Rcb Team:"+rcb.getCaptainName());
}}