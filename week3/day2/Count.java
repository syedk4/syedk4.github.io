package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company = "amazon development center";
		
		char[] charArray = company.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (map.containsKey(charArray[i])){
				int charCount = map.get(charArray[i]);
				map.put(charArray[i], charCount+1);
			}else {
				map.put(charArray[i], 1);
			}
		}
		
		System.out.println(map);
		
	}

}
