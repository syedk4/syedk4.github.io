package learnings;

import java.util.Set;
import java.util.TreeSet;

public class Missing {
	  public static void main(String[] args) {
		 
				// TODO Auto-generated method stub
				int[]seq = {2, 1, 2, 3, 4, 3, 6, 5, 7, 9, 8, 9, 10};
				int number = 0;
				Set<Integer> checkasc = new TreeSet<Integer>();	  
				
	  for (int integer : checkasc) {
		  if (checkasc.add(integer)) {
			number = number+1;
		}
	}
	  System.out.println(checkasc);
	  System.out.println(number);
	  
	 
	  
	  
	  
	  }
	}

