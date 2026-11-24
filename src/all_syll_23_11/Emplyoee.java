package all_syll_23_11;

public class Emplyoee {
	
	    double monthlySalary = 25000;

	    void calculateSalary() {
	        double annualSalary = monthlySalary * 12;
	        System.out.println("Annual Salary: " + annualSalary);
	    }

	    public static void main(String[] args) {
	    	Emplyoee e = new Emplyoee();
	        e.calculateSalary();
	    }
	}

