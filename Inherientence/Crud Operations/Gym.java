class Gym{
private String equipments[]=new String[16];
int index;

public boolean addEquipments(String equipment){
boolean isValid=false;
if(equipment!=null && !equipment.isEmpty()){
equipments[index]=equipment;
index++;
}
else{
System.out.println(equipments+"NotValid");
}

return isValid;
}

public void display(){
for(String equip:equipments){
System.out.println(equip);
}}}