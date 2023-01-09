package test.sel.day1;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,4,5,3,7,2,9,12,13,15,10,15,4,5,3};
		//int target = 28;
		
		Arrays.sort(nums);
		
		
		
		for (int i = 0; i < nums.length-1; i++) {
			//for (int j = i+1; j < nums.length; j++) {
				
				
				if (nums[i]== nums[i+1]) {
					
					System.out.println(nums[i]);
					//System.out.println(nums[j]);
					
				}
			
		}
		
	}

}
