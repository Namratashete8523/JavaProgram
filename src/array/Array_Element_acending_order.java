package array;

import java.util.Scanner;

public class Array_Element_acending_order {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	int []array_fist=new int[x];
	System.out.println("Eneter the Elements");
	for(int i=0;i<x;i++)
	{
		array_fist[i]=sc.nextInt();
	}
	for(int i=0;i<array_fist.length;i++)
	{
		for(int j=i+1;j<5;j++)
		{
			if(array_fist[i]>array_fist[j])
			{
				int temp=array_fist[i];
				array_fist[i]=array_fist[j];
				array_fist[j]=temp;
			}
			
		}					
	}
	for(int i=0;i<array_fist.length;i++)
	{
	System.out.print(array_fist[i]+" ");
	}
	}

}
