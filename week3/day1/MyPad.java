package week3.day1;

public class MyPad extends IPad {

	
	public static void main(String[] args) {
		
		MyPad call = new MyPad();
		
		call.watchMovie();
		call.watchMovie(1, "Watching movie in Portait","Watching movie in Landscape");
		call.watchMovie("Continue watching","Watching movie timeout", 20);
		
		
	}
}
