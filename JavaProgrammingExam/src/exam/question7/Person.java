package exam.question7;

/*Create an application that has the following three classes. Student and Instructor that inherit from the Person class.*/

public class Person {
	
	private String firstName;
	private String lastName;
	private long phone;
	public Person(String firstName, String lastName, long phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [firstName = " + firstName + ", lastName = " + lastName + ", phone = " + phone + "]";
	}
	


}
