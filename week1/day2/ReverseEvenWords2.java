package week1.day2;

public class ReverseEvenWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub
				/* Pseudo Code:
				 
				 * Declare the input as Follow
			      		String test = "I am a software tester"; 
				a) split the words and have it in an array
				b) Traverse through each word (using loop)
				c) find the odd index within the loop (use mod operator)
				
				d)split the words and have it in an array
				
				e)print the even position words in reverse order using another loop (nested loop)
				f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
				
				 
			*/
		String test="I am a software tester";
		//split the words and have it in an array
		String[] revtest = test.split(" ");

		String val = "";
		
		//Traverse through each word (using loop)
		for (int i = 0; i < revtest.length; i++) {
//find the odd index within the loop (use mod operator)
		    if (i % 2 != 1)
		    	
		    	//split the words and have it in an array
		        val = val + new StringBuilder(revtest[i]).reverse().toString() + " ";
		    else
		        val = val + revtest[i] + " ";
		}
		val = val.trim();
		System.out.println(val);
		
		
	}

}
