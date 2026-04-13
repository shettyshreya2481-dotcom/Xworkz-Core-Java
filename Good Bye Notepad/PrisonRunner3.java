class  PrisonRunner3{
public static void main(String[] args){
Criminal criminal=new Criminal();
criminal.setCriminalName("Akhtar");
criminal.setCriminalId("42");

Prison prison=new Prison();
prison.createInfo(criminal);
prison.getInfo();
}}