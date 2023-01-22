package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]seq = {2, 1, 2, 3, 4, 3, 6, 5, 7, 9, 8, 9, 10};
		int number = 0;
		Set<Integer> checkasc = new TreeSet<Integer>();
		
		
		for (int i = 0; i < seq.length; i++) {
			
			if (checkasc.add(seq[i]+1)) {
				number = number+seq[i];
			}
			
		}
		System.out.println(checkasc);
		System.out.println(checkasc.size()+1);
		
	
		/*
		 * List<Integer> list = new ArrayList<Integer>(); list.addAll(checkasc);
		 * 
		 * System.out.println(list.get(checkasc.size()));
		 */
		
	}
}
