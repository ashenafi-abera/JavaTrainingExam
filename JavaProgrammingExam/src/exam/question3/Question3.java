package exam.question3;

/*Write a program that takes a number and prints n row pyramid accordingly 
For example: if a user inputs 3, it prints the below three ‘*’ in three rows
*
**
***
If the user inputs 5, then it prints 5 rows as pyramid 
*
**
***
****
******/

public class Question3 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 0 -i; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z <=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
