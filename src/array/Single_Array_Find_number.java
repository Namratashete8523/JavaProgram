package array;

import java.util.Scanner;

public class Single_Array_Find_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter number");
		
		int marks_array[]= new int[size];
		
		for(int i=0;i<size;i++)
		{
			marks_array[i]=sc.nextInt();
		}
		System.out.println("Enter x value=>");
		int x=sc.nextInt();
		for(int i=0;i<marks_array.length;i++)
		{
			if(marks_array[i]==x)
			{
		System.out.println("x found at index" + i);
			
			}
			
				
			
		}
		System.out.println("number not found");

	}

}
