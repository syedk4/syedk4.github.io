package test.sel.day1;

public class JavaProblem7 {

	public static void Example1() {

		int[] nums = { 1, 2, 3, 1 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] != nums[j]) {

					count = i++;

				}

			}

		}
		
		System.out.println(count > 0);
	}

	public static void Example2() {

		int[] nums = { 1, 2, 3, 4 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {

					count = i++;

				}

			}

		}
		System.out.println(count > 0);
	}

	public static void Example3() {

		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {

					count = i++;

				}

			}

		}
		
		
		System.out.println(count > 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaProblem7 e = new JavaProblem7();
		e.Example1();
		e.Example2();
		e.Example3();
		
	}
}
