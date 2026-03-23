class Airport{
String airportName;
String airportLocation;
Terminal terminal;

	/*Airport(String airportName,String airportLocation,Terminal terminal){
this.airportName=airportName;
this.airportLocation=airportLocation;
this.terminal=terminal;
}*/

void getDetails(){
this.terminal.display();
System.out.println("AirportLocation:"+this.airportLocation);
System.out.println("Airport Name:"+this.airportName);
}}
