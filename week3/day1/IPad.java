package week3.day1;

public class IPad extends IOS {

	
	  public void watchMovie() {
	  
	  System.out.println("Watching movie"); }
	  
	  public void watchMovie(int l,String orientation, String watchin ) { 
		
		  if (l == 0) {
			System.out.println(orientation);
		}else {
			System.out.println(watchin);
		}
	  
	  }
	  
	  public void watchMovie(String orientation,String continues, int timeout) { 
		  if (timeout == 20) { 
			  
			  System.out.println(orientation +" "+ timeout); }
		  else {
	  System.out.println(continues); }
	  
	  }
	 
	
	/*
	 * public void watchMovie() {
	 * 
	 * System.out.println("Watching movie"); } public void watchMovie(String
	 * orientation) { System.out.println(orientation); } public void
	 * watchMovie(String orientation, int timeout) {
	 * 
	 * System.out.println(orientation + timeout); }
	 */	
}
