class PVR{

Screen screen;

String movieName;
String location;

PVR(){

}

PVR(String movieName,String location){
this.movieName=movieName;
this.location=location;
}


public boolean createInfo(Screen screen){
	boolean isValid=false;
	
	if(screen!=null){
		this.screen=screen;
		isValid=true;
	}
	return isValid;
}

public void getInfo(){
	System.out.println("Screen Name:"+screen.getScreenName());
	System.out.println("Screen No:"+screen.getScreenNo());
}}