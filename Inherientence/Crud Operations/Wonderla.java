class Wonderla{
private String games[]=new String[21];
int index;
//private double price;

public boolean addGames(String game){
boolean isValid=false;
if(game!=null&&!game.isEmpty()){
games[index]=game;
index++;
isValid=true;
}
else{
System.out.println(game+"Not Valid");
}
return isValid;
}
    public void displayGames() {
        System.out.println("\n--- Games List ---");
        for (String game : games) {
            if (game != null) {
                System.out.println(game);
            }
        }
		}}
		
		
		/*public double calculateTotalAmount() {
        return index * ticketPrice;
    }*/
		
		  /*public void showTotalCollection() {
        System.out.println("\nTotal Visitors: " + index);
        System.out.println("Total Revenue: ₹" + calculateTotalAmount());
    }
}*/

