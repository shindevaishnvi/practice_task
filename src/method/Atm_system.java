package method;

public class Atm_system {
double balance =5000;

public void checkBalance() {
	System.out.println("balance ="+ balance);
}
public void withdrawamount(double amount) {
	if(amount>0 && amount<=balance){
		balance=balance-amount;
		System.out.println("withdraw completed");
	}else {
		System.out.println("failed withdraw");
	}
	
	
}
}
