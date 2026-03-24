class Netflix{
private String webseries[]=new String[18];
int index;


public boolean addWebseries(String webSeries){ //to validate we use boolean
boolean isValid=false;
if(webSeries!=null && !webSeries.isEmpty()){
webseries[index]=webSeries;
index++;
isValid=true;
}else{
System.out.println(webSeries+"Invalid");
}
return isValid;
}

public void display(){
for(String webSeries:webseries){
System.out.println(webSeries);
}}}
