package problems;

import java.util.Iterator;

public class FindNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Amazon has 11400 employees in the Chennai";
		//
		String replaceAll = s.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		char[] charArray = s.toCharArray();
		
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]>=48 && charArray[i]<=57 ) {
				System.out.println(charArray[i]);
			}
		}
	
	}

}
