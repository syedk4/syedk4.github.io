package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	// Here is the input

	// output= 7;

	/*
	 * Pseudo Code: a) Create a empty Set Using TreeSet b) Declare for loop iterator
	 * from 0 to data.length and add into Set c) converted Set into List d) Print
	 * the second last element from List
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		// Created an empty Set using TreeSet
		Set<Integer> empty = new TreeSet<Integer>();
		// Using for loop iterating the array data and adding data into the TreeSet
		for (int i = 0; i < data.length; i++) {

			empty.add(data[i]);

		}
		// Converting Set into the List
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(empty);

		// Printing the data available in List
		System.out.println("The data available in the List are: " + list);
		System.out.println("The second last element from the List is: " + list.get(empty.size() - 2));

	}

}
