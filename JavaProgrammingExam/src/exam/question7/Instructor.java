package exam.question7;

public class Instructor extends Person{

	int grossSalary;
	public Instructor(String firstName, String lastName, int phone, int grossSalary) {
		super(firstName, lastName, phone);
		
		this.grossSalary = grossSalary;
		
	}
	public int getGrossSalary() {
		int tax = (int) (.2 * grossSalary);
		return grossSalary = grossSalary -tax;
		
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	@Override
	public String toString() {
		int tax = (int) (.2 * grossSalary); 
		return "Instructor [netSalary = " + (grossSalary-tax) + "]";
	}

}
