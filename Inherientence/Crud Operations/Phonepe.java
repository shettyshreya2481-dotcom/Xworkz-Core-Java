class Phonepe{
private String insuranceNames[]=new String[27];
int index;

public boolean getDetails(String insuranceName){
boolean isValid=false;
if(insuranceName!=null && !insuranceName.isEmpty()){
insuranceNames[index]=insuranceName;
index++;
}
else{
System.out.println(insuranceNames+"not Valid");
}
return isValid;
}

public void display(){
for(String insuranceName:insuranceNames){
System.out.println(insuranceName);
}}
}