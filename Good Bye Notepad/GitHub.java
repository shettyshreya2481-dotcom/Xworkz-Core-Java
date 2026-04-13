class GitHub{

String userName;
String email;

Repository repo;

GitHub(){

}

GitHub(String userName,String email){
this.userName=userName;
this.email=email;
}

public boolean createInfo(Repository repo){
boolean isvalid=false;

if(repo!=null){
this.repo=repo;
isvalid=true;
}

return isvalid;
}

public void getInfo(){
System.out.println("Repository Name:"+repo.getRepoName());
System.out.println("Repository Id:"+repo.getRepoId());
}}