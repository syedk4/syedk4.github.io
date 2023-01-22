package week3.day2.Assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	/*
	 * Pseudo code 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	 *
	 *Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	 * c) Create a empty Set 
	 * d) Iterate the String array
                 d.1) add each word into Set
	 * e) Print the Set values which is having unique words
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] test = text.split(" ");
		
		Set<String> empty = new LinkedHashSet<String>();
		
		
		  for (String words : test) {
		  
		  if (empty.add(words)) {
		  
		  System.out.print(words+" ");
		  
		  
		  }
		  
		  
		  
		  }
		 
		 
	}
		
		}
