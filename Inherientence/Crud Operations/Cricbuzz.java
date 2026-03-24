class Cricbuzz {
    private String matches[] = new String[20];
    int index;

    public boolean addMatch(String match){
        boolean isValid = false;

        if(match != null && !match.isEmpty()){
            if(index < matches.length){
                matches[index] = match;
                index++;
                isValid = true;
            } else {
                System.out.println("Match list is full");
            }
        } else {
            System.out.println(match + " Not Valid");
        }

        return isValid;
    }

    public void displayMatches(){
        System.out.println("\n--- Live Matches ---");
        for(String match : matches){
            if(match != null){
                System.out.println(match);
            }
        }
    }
}