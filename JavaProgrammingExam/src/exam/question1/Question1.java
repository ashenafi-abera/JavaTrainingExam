package exam.question1;

/*Write a program that have variables 
Name (String)
city_and_state (String)
gross salary (double)
tax (double) = 0.2
net_salary(double)
//Tax is always 20%.
And print out the following.
Eg: Hello my name is John Doe, I live in Charlotte NC, my gross salary is $100,000. I pay $20,000 in tax and I take home $80,000.*/

public class Question1 {

	public static void main(String[] args) {
		
		String name = "Ashenafi Abera";
		String city_and_state = "Denver, Colorado";
		double grossSalary = 100000.0;
		double tax = .2 * grossSalary;
		double net_salary = grossSalary - tax;
		
		System.out.println("Hello my name is: " + name + ",");
		System.out.println("I live in: " + city_and_state + ",");
		System.out.println("My gross salary is $" + grossSalary + ".");
		System.out.println("I pay $" + tax + " in tax and I take home $" + net_salary + ".");
	}

}
