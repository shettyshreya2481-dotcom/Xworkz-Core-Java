class Train{
Boggy boggy;
String trainName;

Train(String trainName,Boggy boggy){
this.trainName=trainName;
this.boggy=boggy;
}

void getDetails(){
	boggy.display();
System.out.println("Train Name:"+trainName);
//System.out.println("Boggy:"+this.boggy);
}}