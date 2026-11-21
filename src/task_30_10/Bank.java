package task_30_10;

public class Bank {
	private double balance;
 public void deposit(double amount) {
	 balance=balance +amount;
 }
 public void withdraw(double amount ) {
	 if(amount<=balance) {
		 balance=balance - amount;
	 }else {
		 System.out.println("low balance");
	 }
 }
public double getbalance() {
	return balance;
}	 
	 
 }

