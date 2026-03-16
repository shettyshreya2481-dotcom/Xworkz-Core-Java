class MallRunner{
public static void main(String[] args){
String[] products={"Bangles","Chains"};
Shop shop=new Shop("Aindra",products,235);
Mall mall=new Mall("Orion Mall","Bengaluru",shop);
mall.getDetails();
}}