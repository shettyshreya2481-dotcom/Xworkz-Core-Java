class RCB {
    private String players[] = new String[15];
    int index;

    public boolean addPlayer(String player){
        boolean isValid = false;

        if(player != null && !player.isEmpty()){
            if(index < players.length){
                players[index] = player;
                index++;
                isValid = true;
            } else {
                System.out.println("Team is full");
            }
        } else {
            System.out.println(player + " Not Valid");
        }

        return isValid;
    }

    public void displayPlayers(){
        System.out.println("\n--- RCB Players List ---");
        for(String player : players){
            if(player != null){
                System.out.println(player);
            }
        }
    }
}