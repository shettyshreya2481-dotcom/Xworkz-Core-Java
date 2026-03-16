class Dance{
Form form;
String danceAcademia;

public Dance(String danceAcademia,Form form){
this.danceAcademia=danceAcademia;
this.form=form;

}

void getDetails(){
System.out.println("Dance Academic:"+this.danceAcademia);
System.out.println("Form:"+this.form);
form.display();
}}