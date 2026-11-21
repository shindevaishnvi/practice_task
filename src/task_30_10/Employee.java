package task_30_10;

public class Employee {
private double salary;

public void setSalary(double salary) {
	if (salary>0) {
	this.salary=salary;
	}else {
		System.out.println("invalid salary");
	}
}
	public double getSalary() {
		return salary;
	}
}

