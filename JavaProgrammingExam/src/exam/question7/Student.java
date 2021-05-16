package exam.question7;

public class Student extends Person{
	
	double gpa;
	public Student(String firstName, String lastName, int phone, double gpa) {
		super(firstName, lastName, phone);
		this.gpa = gpa;
		
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [firstName = " + getFirstName() + ", lastName = " + getLastName()
				+ "gpa = " + gpa + ", phoneNumber =" + getPhone() + "]";
	}

	

}
