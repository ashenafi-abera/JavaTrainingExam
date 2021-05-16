package exam.question6;

public class Question6 {

	
	public static void main(String[] args) {
		
		int[] testElements = { 8, 5, 6, 19, 16 };
		
		
		for (int i = 0; i < testElements.length; i++) {
			if (testElements[i] % 3 == 0) {
				System.out.println("MagicArray");
				break;
			}

			else {
				System.out.println("Non MagicArray");
				break;
			}

		}

	}

}
