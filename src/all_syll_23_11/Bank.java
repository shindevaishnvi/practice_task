package all_syll_23_11;

public class Bank {
int balance=50000;
void deposit (int amount) {
	balance=balance+amount ;
	System.out.println(balance);
}
void withdrow(int amount) {
	if (amount<=balance) {
		balance =balance-amount;
		System.out.println(balance);
	}else {
		System.out.println("low balance");
	}
	
}
public static void main(String[] args) {
	Bank b=new Bank();
	b.deposit(3454);
	b.withdrow(6769);
	
}
}
