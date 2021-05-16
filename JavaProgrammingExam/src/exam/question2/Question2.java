package exam.question2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program that accepts mark of a student and prints the grade
If the average of marks is >= 90 then prints Grade ‘A’
If the average of mark is >=80 then prints Grade ‘B’
If the average of mark is >=70 then prints Grade ‘C’
If the average of mark is >=50 then prints Grade ‘D’
else prints Grade ‘F’
Note: Mark of a student should be between 0 and 100*/

public class Question2 {

	public static void main(String[] args) {
		
		try {
		Scanner gradeInput = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 an 100: ");
		
		int num = gradeInput.nextInt();
		
		if (num >= 90) {
			System.out.println("Grade: A");
		}
		else if (num >= 80) {
			System.out.println("Grade: B");
		}
		else if (num >= 70) {
			System.out.println("Grade: C");
		}
		else if (num >= 50) {
			System.out.println("Grade: D");
		}
		else  {
			System.out.println("Grade: F");
		}
		
		gradeInput.close();
		
		}catch(InputMismatchException e) {
			System.out.println("You entered invalid value");
		}

	}

}
