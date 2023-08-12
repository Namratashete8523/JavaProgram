package practice;

public class ThisKeyword {
	public int a=17; 
	 static int b=15;
	 private int x=90;
	 ThisKeyword()
	 {
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(x);
		 
		 
	 }
public static void main(String args[])
{
System.out.println(b);


}

public void accessmethod()
{
	System.out.println(a);

System.out.println(b);
}


}
