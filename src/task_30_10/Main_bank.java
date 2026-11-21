package task_30_10;

public class Main_bank {
public static void main(String[] args) {
	Bank b=new Bank();
	b.deposit(50000);
	b.withdraw(10000);
	
	System.out.println("balance is-->"+ b.getbalance());
}
}
