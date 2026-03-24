class ElectricalShop {
    private String items[] = new String[20];
    int index;

    public boolean addItem(String item){
        boolean isValid = false;

        if(item != null && !item.isEmpty()){
            if(index < items.length){
                items[index] = item;
                index++;
                isValid = true;
            } else {
                System.out.println("Item list is full");
            }
        } else {
            System.out.println(item + " Not Valid");
        }

        return isValid;
    }

    public void displayItems(){
        System.out.println("\n--- Electrical Items List ---");
        for(String item : items){
            if(item != null){
                System.out.println(item);
            }
        }
    }
}