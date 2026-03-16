class Formula1{
Franchise franchise;
String teamName;
String driver;

Formula1(String teamName,String driver,Franchise franchise){
this.teamName=teamName;
this.driver=driver;
this.franchise=franchise;
}

void getDetails(){
	franchise.display();
System.out.println("Driver:"+this.driver);
System.out.println("Driver:"+this.teamName);
}}