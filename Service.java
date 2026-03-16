class Service{
String serviceName;
String client ;
String manager;

Service(String serviceName,String client,String manager){
this.serviceName=serviceName;
this.client=client;
this.manager=manager;
}

void display(){
System.out.println("Service Name:"+this.serviceName);
System.out.println("Client Name:"+this.client);
System.out.println("Manager:"+this.manager);
}}
