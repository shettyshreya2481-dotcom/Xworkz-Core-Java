class Television {
    private String channels[] = new String[20];
    int index;

    public boolean addChannel(String channel){
        boolean isValid = false;

        if(channel != null && !channel.isEmpty()){
            if(index < channels.length){
                channels[index] = channel;
                index++;
                isValid = true;
            } else {
                System.out.println("Channel list is full");
            }
        } else {
            System.out.println(channel + " Not Valid");
        }

        return isValid;
    }

    public void displayChannels(){
        System.out.println("\n--- Channel List ---");
        for(String channel : channels){
            if(channel != null){
                System.out.println(channel);
            }
        }
    }
}