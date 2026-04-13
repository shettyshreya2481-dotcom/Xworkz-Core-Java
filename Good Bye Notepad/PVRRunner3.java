class PVRRunner3{
public static void main(String[] args){
Screen screen=new Screen();
screen.setScreenName("Screen magma");
screen.setScreenNo("23-io");

PVR pvr=new PVR();
pvr.createInfo(screen);
pvr.getInfo();
}}