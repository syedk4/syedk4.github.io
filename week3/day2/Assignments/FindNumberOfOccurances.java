package week3.day2.Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1}; output: 2 -> 3 , 3 -> 2, 4 -> 1
		 * 
		 * Order: Ascending Order
		 * 
		 */

		/*
		 * Psuedcode:
		 * 
		 * a) Create Map -> TreeMap b) For loop -> each number -> add to the map c) If
		 * it is exist -> update it with + 1 Else -> new entry with 1 as value
		 * 
		 */
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> in = new TreeMap<Integer, Integer>();

		for (int i : input) {

			if (in.containsKey(i)) {
				in.put(i, in.get(i) + 1);
			} else {
				in.put(i, 1);
			}

			// System.out.println(in.containsKey(i));

		}

		for (Map.Entry<Integer, Integer> entry : in.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

}
