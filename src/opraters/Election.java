package opraters;

public class Election {
	public static void main(String[] args) {
		int age =26;
		if(age>=18) {
			System.out.println("eligible for vote");
			if(age>=25) {
				System.out.println("eligible for contest");
			}else {
              System.out.println("not eligible for contest");				
			}
			
			}else {
				System.out.println("not eligible for vote");
			}
		}
				
	}


