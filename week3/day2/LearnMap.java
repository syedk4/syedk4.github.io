package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "amazon development center";
		
		Map<String, Integer> mentors = new HashMap<String, Integer>(); 
		//mentors.put("2020111", "Ram");
		mentors.put("Ram", 22222);
		mentors.put("Test", 33333);
		mentors.put("Tests", 44444);
		mentors.put("Testng", 44444);
		
		System.out.println(mentors.size());
		
		mentors.entrySet();
		
		Set<Entry<String, Integer>> entrySet = mentors.entrySet();
		
		/*for (Entry<String, Integer> entry : mentors.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		
	}

}
