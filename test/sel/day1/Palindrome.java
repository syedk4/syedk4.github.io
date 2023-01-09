package test.sel.day1;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Madam";
		char[] name1 = name.toCharArray();
		
		String palinDrome = "";
		
		for (int i = name1.length-1 ; i >=0; i--) {
			
			palinDrome = palinDrome+name1[i];
			
			
		}
		
		System.out.println(palinDrome);
		
			
	}

}
