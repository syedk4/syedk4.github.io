package week1.day2;

public class FindInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using replaceAll method
		/*
		 * String details = "Amazon has 11400 employees in chennai";
		 * 
		 * String replaceAll = details.replaceAll("[^0-9]", "");
		 * System.out.println(replaceAll);
		 */
		String details = "Amazon has 11400 employees in chennai";
		
		char[] charArray = details.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] >= 48 && charArray[i] <=57) {
				
				System.out.print(charArray[i]);
				
			}
		}
	
	}

}
