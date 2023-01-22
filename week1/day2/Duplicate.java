package week1.day2;

import java.util.Arrays;

public class Duplicate {

	// Psuedo code:
	// Loop through a number and compare with those number
	// if match found print or else print no match found

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] n = {2,5,7,7,5,9,2,3};
		//int[] n = {0,2,3,4,5,8,9,7,1,6 };
		Arrays.sort(n);
		
		
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {

				if (n[i] == n[j]) {

					System.out.println(n[i]);
					//System.out.println(n[j]);
					break;
				}
				
			}
		}
		
		//System.out.println("No duplicate found");
	}

}
