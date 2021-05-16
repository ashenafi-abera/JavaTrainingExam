package exam.question7;

public class CollectionApplication {

	public static void main(String[] args) {
		
		/*Person student1 = new Person("Abebe", "Tadesse", 1046181111);
		System.out.println(student1);*/
		
		Student student = new Student("Natu", "Araya", 1046181111, 3.95);
		System.out.println(student);
		
		Instructor grossSalary = new Instructor("Abebe", "Tadesse", 1046181111, 10000);
		
		
		System.out.println(grossSalary);

	}

}
