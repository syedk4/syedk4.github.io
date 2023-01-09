package test.sel.day1;

public class JavaProblem8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int[] nums = {1,2,3,1};
		int k = 3;
		
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]-nums[j] <= k) {
									System.out.println(k);
									k++;
				}

			}

		}
		
		System.out.println(k > 0);
	}
		
	}

