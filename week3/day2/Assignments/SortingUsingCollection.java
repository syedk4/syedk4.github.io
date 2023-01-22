package week3.day2.Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {

		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems

		
		String[] comp = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> newlist = Arrays.asList(comp);
		
		Collections.sort(newlist);
		
				
		System.out.println(newlist.size());
		
		
		for (int i = newlist.size() - 1 ; i >= 0; i--) {
			
			
			System.out.print(newlist.get(i)+ " ");
		}
		
		}

}
