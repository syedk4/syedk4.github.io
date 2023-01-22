package week1.day1;

public class CheckMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Cost = 10000;
		char logo = 'A';
		String Brand = "Apple";
		boolean isItNew = true;

		
		Mobile check = new Mobile();
		
		System.out.println(check.mobileCount());
		System.out.println("Price:" + Cost + " " + "Logo:" + logo + " " + "Brand:" + Brand + " " + "Is it New: " + isItNew);
		//printing mobile details
		System.out.println(check.mobileOn("Mobile is On"));
		System.out.println(check.mobileCall(123457890));
		System.out.println(check.mobileDisconnect("Disconnected"));
		System.out.println(check.mobileOff("Mobile is Off"));
		System.out.println(check.mobileDSold("SOLD"));
	}

}
