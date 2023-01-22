package week1.day2;

public class RverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break into characters
		//loop from the end to go to first
		//print
		
		
		
		String name = "syed+sufdar+hussain";
		//String name = "MaDaM";
		name = name.toLowerCase();
				//convert the string to lower case 
		char[] charArray = name.toCharArray();
		System.out.println("The name is: "+name);
		System.out.println("The length of the name is: "+charArray.length);
		System.out.print("The name got reversed: ");
		
		String reverseString = "";
		
		for (int i = charArray.length-1; i >=0; i--) {
			reverseString = reverseString+charArray[i];
			//System.out.print(charArray[i]);
			
			
		}
		System.out.println(reverseString);
		
		//both the initial and reverse are same
		
		
		if (name.equalsIgnoreCase(reverseString)) {
			//you can use equalsIgnoreCase method
			System.out.println("They are palindrome");
		}
		else {
			System.out.println("They are not palindrome");
		}
		
		
	}

}
