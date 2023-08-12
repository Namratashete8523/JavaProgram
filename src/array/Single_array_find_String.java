package array;

import java.util.Scanner;

public class Single_array_find_String {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int size=sc.nextInt();
	
	String []str_array=new String[size];
	System.out.println("Add the strings");
	for(int i=0; i<size;i++)
	{
		str_array[i]=sc.nextLine();
		
	}
	
	 String str="Abc";
	
	 for(int i=0; i<str_array.length;i++)
	 {
		if(str_array[i].equals(str))
		 {
			 System.out.println("string found at"+i);
	      }
		 }
	
	
	 }
	}


