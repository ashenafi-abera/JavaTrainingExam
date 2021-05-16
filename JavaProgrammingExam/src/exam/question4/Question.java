package exam.question4;

/*Write a program that takes a string and displays the vowels count in the input string.*/

public class Question {

	public static void main(String[] args) {
		
		
		String display = "Tigray";
		int vowels = 0;
		
		for(int i = 0; i < display.length(); i++) {
			char check = display.charAt(i);
			
			if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
				vowels++;
			}
			
		}
		System.out.println("Vowels: " + vowels);
	}

}
