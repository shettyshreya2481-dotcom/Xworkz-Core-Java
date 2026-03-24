class Ecommerce {
    private String products[] = new String[20];
    int index;

    public boolean addProduct(String product){
        boolean isValid = false;

        if(product != null && !product.isEmpty()){
            if(index < products.length){
                products[index] = product;
                index++;
                isValid = true;
            } else {
                System.out.println("Product list is full");
            }
        } else {
            System.out.println(product + " Not Valid");
        }

        return isValid;
    }

    public void displayProducts(){
        System.out.println("\n--- Product List ---");
        for(String product : products){
            if(product != null){
                System.out.println(product);
            }
        }
    }
}