package array;

import java.util.Arrays;

public class Array_Sort_method {

	public static void main(String[] args) {
		int temp=0;
		int sort_array[]= {10,5,8,3,4,6};
		Arrays.sort(sort_array);
		System.out.println(Arrays.toString(sort_array));
		
		for(int i=0;i<sort_array.length;i++)
		{
			for(int j=i+1;j<sort_array.length;j++)
			{
				if(sort_array[i]>sort_array[j])
				{
					temp=sort_array[i];
					sort_array[i]=sort_array[j];
					sort_array[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<sort_array.length;i++)
		{
	System.out.print(sort_array[i]);
		}
	}

}
