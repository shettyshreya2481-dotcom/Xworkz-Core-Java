class BankAccount{
double currentBalance;

public double getBalance(){
	return currentBalance;
}

void credit(double amount){
	System.out.println("Credit Started");
	if(amount>0){
currentBalance+=amount;
System.out.println("Cuurent Balance:"+currentBalance);
}else{
	System.out.println("Invalid Amount");
}
System.out.println("Credit Ended");
}

double debit(double amount){
	System.out.println("Debit Started");
if(amount<=currentBalance){
currentBalance-=amount;
//System.out.println("Cuurent Balance:"+currentBalance);
}else{
	System.out.println("Insufficient Balance");
}
return amount;
}
}