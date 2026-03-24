class Spotify {
    private String songs[] = new String[25];
    int index;

    public boolean addSong(String song){
        boolean isValid = false;

        if(song != null && !song.isEmpty()){
            if(index < songs.length){   // prevent overflow
                songs[index] = song;
                index++;
                isValid = true;
            } else {
                System.out.println("Song list is full");
            }
        } else {
            System.out.println(song + " Not Valid");
        }

        return isValid;
    }

    public void displaySongs(){
        System.out.println("\n--- Songs List ---");
        for(String song : songs){
            if(song != null){
                System.out.println(song);
            }
        }
    }
}