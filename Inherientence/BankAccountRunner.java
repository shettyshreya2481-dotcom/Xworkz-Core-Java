class BankAccountRunner{
public static void main(String[] args){
BankAccount bank=new BankAccount();
double checkBalance=bank.getBalance();
System.out.println("Present balance:"+checkBalance);
System.out.println("====");


bank.credit(500.00);
checkBalance=bank.getBalance();
System.out.println("Available Balance:"+checkBalance);
System.out.println("====");

double amount=bank.debit(200.00);
System.out.println("Debited Amount:"+amount);
checkBalance=bank.getBalance();
System.out.println("Available Balance:"+checkBalance);
System.out.println("Debit Ended");
System.out.println("====");
}}