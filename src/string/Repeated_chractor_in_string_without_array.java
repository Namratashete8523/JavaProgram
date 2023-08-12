package string;

public class Repeated_chractor_in_string_without_array {

	public static void main(String[] args) {
		String str="Namrata shete", reverse="";
		int count=0;
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(str.charAt(i)==str.charAt(j))
				 {
					 count++;
					 break;
				 }
				 
			 }
			
		 }
		System.out.println("Repeated charactor without array"+ count);

	}

}
