package practice;

public class ststicMain {

	ststicMain()
	{
		System.out.println("This is a default constructor");
	}
	
	public static void main(String[] args) {
	abcd();
	

	}
	public static void main(int[]args) {
		abcd();
		

		}
	public void abc()
	{
		System.out.println("This is a non static method");
	}
	
	public static void abcd()
	{
		System.out.println("This is a statiic method");
	}

}
