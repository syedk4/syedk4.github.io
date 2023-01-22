package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		
		String name = "hussain";
		char[] charName = name.toCharArray();
		Set<Character> changeSet = new LinkedHashSet<Character>();
		String uniqueChar = "";
		
		for (int i = 0; i < charName.length; i++) {
			if (changeSet.add(charName[i])) {
				uniqueChar = uniqueChar+charName[i];
			}
		}
		System.out.println("The real name is: "+ name);
		System.out.println("The unique name is: "+uniqueChar);
		
	}

}
