package week1.day2;


public class ReverseEvenWords1 {

	public static void main(String[] args) {
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

		String test = "I am a software tester";
		//char[] 
		
		String[] conarr = test.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < conarr.length ; i++) {
			
			
			//System.out.println(revtest[i]);
			
			
			  if (i%2 !=0) {
			  
				  
				  char[] conchar = conarr[i].toCharArray();
				  String revWord = " ";
				  
			  //revtest[i].split(" "); 
			 // System.out.print(conchar[i]+" "); 
			  
			 
				
				for (int j =  conchar.length-1; j >0; j--) {
					
					//System.out.println();
					
					revWord += String.valueOf(conchar[j-1]);	
				}
				result.append(revWord).append(" ");
				
			}else {
				result.append(conarr[i]).append(" ");
			}
			
			System.out.println(result.toString());
		}
		
	}
}

