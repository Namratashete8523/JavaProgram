package array;

public class Find_out_Highest_Element_Array {

	public static void main(String[] args) {
		int sort_array[]= {10,5,8,3,4,6};
		int max=sort_array[0];
		for(int i=0;i<sort_array.length;i++)
		{
			if(sort_array[i]>max)
		{
			max=sort_array[i];	
			
		}
			
			}
		System.out.println(max);
	}

}
