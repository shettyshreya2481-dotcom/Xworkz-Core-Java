class Universe{

private String galaxies[]=new String[17];
int index;

public boolean addGalaxy(String galaxy){
boolean isValid=false;

if(galaxy!=null && !galaxy.isEmpty()){
	if(index<galaxies.length){
galaxies[index]=galaxy;
index++;
}
}else{
System.out.println(galaxy+"Is Not Valid");
}
return isValid;
}

public void display(){
for(String galaxy:galaxies){
System.out.println(galaxy);
}}
}