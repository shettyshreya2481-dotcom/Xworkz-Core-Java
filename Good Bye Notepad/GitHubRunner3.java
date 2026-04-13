class GitHubRunner3{
public static void main(String[] args){
Repository repo=new Repository();
repo.setRepoName("Shettyshreya24");
repo.setRepoId("12GH");

GitHub git=new GitHub();
git.createInfo(repo);
git.getInfo();
}}