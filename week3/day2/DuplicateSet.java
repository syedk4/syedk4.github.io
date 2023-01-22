package week3.day2;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName = "Google";
		String lowerCase = companyName.toLowerCase();
		
		char[] company = lowerCase	.toCharArray();
		
		Set<Character> uh = new HashSet<Character>();
		Set<Character> ut = new TreeSet<Character>();
		Set<Character> ul = new LinkedHashSet<Character>();

		for (int i = 0; i < company.length; i++) {

			uh.add(company[i]);
			ut.add(company[i]);
			ul.add(company[i]);
			

		}
		
		for(Character character : ut) {
			System.out.print(character);
		}

		System.out.println(ul);
		System.out.println(uh);
		
	}

}
