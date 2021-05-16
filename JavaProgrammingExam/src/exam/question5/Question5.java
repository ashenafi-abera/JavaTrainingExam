package exam.question5;

/*Write a program that validates a phone number input,  make sure the length of the input is 10 digits*/

import java.util.Scanner;

class phoneNumber{
	static boolean checkPhoneNumber(String input) {
		try {
			Integer.parseInt(input);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
public class Question5 {

	public static void main(String[] args) {
		
		Scanner inputPhoneNumber = new Scanner(System.in);
		
		System.out.print("Please enter a phone numebr: ");
		
		String phoneNum = inputPhoneNumber.next();
		
				
		if (phoneNumber.checkPhoneNumber(phoneNum) && (phoneNum.length() == 10)) {
			System.out.println("Valid phone number");
		}
		else if (phoneNumber.checkPhoneNumber(phoneNum) && (phoneNum.length() >= 10)){
			System.out.println("Invalid phone number, too long");
		}
		else {
			System.out.println("Invalid phone number, too short");
		}
		
		inputPhoneNumber.close();

	}

}
