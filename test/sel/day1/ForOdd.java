package test.sel.day1;

public class ForOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = { 98, 99, 100, 97, 99 };
		String[] sub = { "Tamil", "English", "Maths", "Science", "Social Science" };
		// String con = sub.toString();

		for (int i = 0; i < marks.length; i++) {

			if (i % 2 != 1) {
				System.out.print(sub[i] + ":");

				System.out.println(marks[i]);
			}

		}

		
		int[] scores = new int[5];
		System.out.println(scores[0]);
		
		String[] stud = new String[5];
		System.out.println(stud[0]);
		
	}

}
