package week1.day2;

public class PrintSpecificChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print how many time expected chracter present !!
		
		/* Psuedo
		 * 1. break into the chracters
		 * 2. traverse to each char
		 */
		
		
		String name = "Hexaware";
		char expected = 'e';
		int count = 0;
		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == expected) {
			//using toCharArray method	
				
			//if (charArray[i] == 101) {
			// using asci numbers to count the length.	
				count++;
				
			}
			
		}
		System.out.print("The number of e chanacer available in given input are: " + count);
	}

}
