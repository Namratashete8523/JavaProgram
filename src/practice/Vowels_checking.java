package practice;

public class Vowels_checking {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("rrr"));//true
		System.out.println(stringContainsVowels("rrr")); //false
		
		
	}
	
		public static boolean stringContainsVowels(String str)
		{
			return str.toLowerCase().matches(".*[aeiou]*.");
		}
		
		
		
		
		
		
		
	
}
