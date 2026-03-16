class Form{
String danceForm;
double timings;

public Form(String danceForm,double timings){
this.danceForm=danceForm;
this.timings=timings;
}

void display(){
System.out.println("Dance Form:"+this.danceForm);
System.out.println("Timings:"+this.timings);
}
}