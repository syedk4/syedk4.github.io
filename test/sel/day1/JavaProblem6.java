package test.sel.day1;

public class JavaProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,3};
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[i/2] != 0) {
					System.out.println("The duplicate numbers are: "+nums[i]);
				}
				
			}
			
		}
	}

}
