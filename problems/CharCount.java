package problems;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "Hexaware";
		char expected = 'e';
		int count = 0;
		char[] charArray = company.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] == expected) {
				
				 count++;
				 
			}
		}
		System.out.println(count);
		
	}

}
