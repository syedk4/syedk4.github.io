package week1.day2;

public class ReverseTheWordAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "Amazon development center, Chennai ";
		String words1 = words.toLowerCase();
		String[] reversewords = words1.split(" ");
		
		System.out.print("The reversed words are: ");
		
		for (int i = reversewords.length - 1; i >= 0; i--) {
			System.out.print(reversewords[i] + " ");

		}
	}

}
