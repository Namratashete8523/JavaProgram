package array;

public class Duplicate_Element_in_array {
	public static void main(String[] args) {
	
		int arr_dub[]= {10,20,10,20,30,40,50};
		for(int i=0;i<arr_dub.length;i++)
		{
			for(int j=i+1;j<arr_dub.length;j++)
			{
				if(arr_dub[i]==arr_dub[j])
				{
					System.out.println("Duplicate Element in array=>"+arr_dub[i]);
				}			
			}
		}
	
	
	
	}
	}

