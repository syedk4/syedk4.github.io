package test.sel.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "TestLeaf";
		
		int count = name.length();
		System.out.println(count);
		
		char[] charArray = name.toCharArray();
		//System.out.println(charArray[0]);
		
		
		for (int i = 0; i < charArray.length; i++) {
			
			//System.out.println(charArray[i]);
			
			if (charArray[i]=='L') {
				//System.out.println("'"+charArray[i]+"'");
			}
			
		}
		
		if (name.contains("L")) {
			System.out.println(name.contains(name));
		}
		
	}

}
