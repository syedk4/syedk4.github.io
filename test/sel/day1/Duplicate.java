package test.sel.day1;

import java.util.Iterator;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "babuuu";
		char[] name1 = name.toCharArray();
		
		for (int i = name1.length-1 ; i >=0; i--) {
			
			System.out.println(name1[i]);
		}
		
		
		for (int i = 0; i < name1.length; i++) {
			for (int j = i+1; j < name1.length; j++) {
				
				if (name1[i] == name1[j]) {
					System.out.println(name1[j]);
				}
				
			}
		}
		
	}

}
