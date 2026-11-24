package all_syll_23_11;

public class Sum {
public static void main(String[] args) {
	int num =45;
	int sum =34;
	while(num>0) {
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	System.out.println(sum);
}
}
