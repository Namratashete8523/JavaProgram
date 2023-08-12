package array;

import java.util.Scanner;

public class Array_Elements_dec_order {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int[] array_sorted=new int[num];
		System.out.println("Eneter The Element");
		for(int i=0;i<array_sorted.length;i++)
		{
			array_sorted[i]=sc.nextInt();
		}
		for(int i=0;i<array_sorted.length;i++)
		
		{
			for(int j=i+1;j<array_sorted.length;j++)
			{
				if(array_sorted[i]<array_sorted[j])
				{
				int temp=array_sorted[i];
				array_sorted[i]=array_sorted[j];
				array_sorted[j]=temp;
				}
			}
		}
		for(int i=0;i<array_sorted.length;i++)
			
		
		{
			System.out.println(array_sorted[i]);
		}
	}

}
