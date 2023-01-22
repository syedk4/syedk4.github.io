package week1.day2;

//import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsPrime primeRun1 = new IsPrime();
	
		primeRun1.primeRun();
	}
	
	
	public void primeRun(){
		
		int n = 8;
		boolean bPrime = true;
		
	for (int i = 2; i < n; i++) {
		
		if (n % i ==0) {
			
			System.out.println("The number is not prime " + n);
			bPrime = false;
			break;
		} 
		
		
	}
		
	if (bPrime) {
		
		System.out.println("The number is Prime " + n);
	}
		
	}
}
