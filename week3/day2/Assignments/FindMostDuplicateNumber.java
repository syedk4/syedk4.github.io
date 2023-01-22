package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMostDuplicateNumber {
	//Find the most duplicate number -> First most duplicate
		/*
		* input: abbaba
		* output: b
		* 
		* 
		*/

		/*
		 * Psuedocode
		 * 
		 * a) Map -> HashMap 
		 * b) String -> ch[] -> Get all the character -> occurance
		 * c) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abbaba";
		
		Map<Character, Integer> in = new HashMap<Character, Integer>();
		
		char[] inCharArray = a.toCharArray();
		
		for (char c : inCharArray) {
			if (in.containsKey(c)) {
				in.put(c, in.get(c) + 1);
			} else {
				in.put(c, 1);
			}

		}
		//System.out.println(in);
		
		char FrequentChar = ' ';
		int count = 0;
		
		for (Map.Entry<Character, Integer> entry : in.entrySet()) {
			if (entry.getValue() > count) {
				FrequentChar = entry.getKey();
				count = entry.getValue();
			}
			
			
			
		}
		System.out.println(FrequentChar);
	
	
		
	}

}
