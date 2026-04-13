class Politician{

Voter voter;

String politicianName;
String politicianId;

Politician(){

}

Politician(String politicianName,String politicianId){
this.politicianName=politicianName;
this.politicianId=politicianId;
}

public boolean createInfo(Voter voter){
boolean isValid=false;

if(voter != null){
this.voter=voter;
isValid=true;
}

return isValid;
}

public void getInfo(){
System.out.println("Voter Name:"+voter.getVoterName());
System.out.println("Voter Id:"+voter.getVoterId());
}}
