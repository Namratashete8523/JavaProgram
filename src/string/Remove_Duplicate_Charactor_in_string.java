package string;

public class Remove_Duplicate_Charactor_in_string {

	public static void main(String[] args) {
	String str="Namrata",reverse="";
	int count=0;
	
	for(int i=str.length()-1; i>=0;i--)
	{
			reverse=reverse+str.charAt(i);
		
		/*for(int j=i+1; j<chararray.length;j++)
		{	
		if(chararray[i]==chararray[j])
		{
			count++;
		
		
		}
		}*/
	}
	System.out.print(reverse);
	}

}
