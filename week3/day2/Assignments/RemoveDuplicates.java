package week3.day2.Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

//		Declare a String as "PayPal India"

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it

//	Declared a String as a = "PayPal India"

		String a = "PayPal India";
		// Convert String to CharArray
		char[] b = a.toCharArray();

		// Declaring 2 sets charSet and dupCharSet
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		// Iterating character array and add it into charSet
		for (Character c : b) {

			charSet.add(c);

			if (charSet.add(c)) {

				dupCharSet.add(c);

			}
		}
		System.out.print(charSet);
		System.out.println("dup" + dupCharSet);

		for (Character d : dupCharSet) {
			if (charSet.contains(d)) {
				charSet.remove(d);
			}

		}

		for (Character e : charSet) {

			if (e != ' ') {
				System.out.print(e + " ");
			}

		}

		/*
		 * for (int i = 0; i < b.length; i++) {
		 * 
		 * charSet.add(b[i]);
		 * 
		 * System.out.print(b[i]);
		 * 
		 * }
		 */

	}

}
