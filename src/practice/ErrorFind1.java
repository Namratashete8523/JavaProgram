package practice;

import java.util.Arrays;

public class ErrorFind1 {

	public static void main(String[] args) {
	int[] a= {10,20,30,40};
	int[] b= {50,60,20,10};
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));

	
	
	if(a==b)
{
System.out.println("Arrays are equal");	

}
else
{
System.out.println("Arrays are not equal");	
}
	
	}

}
