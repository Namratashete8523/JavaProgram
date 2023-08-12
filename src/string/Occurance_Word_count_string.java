package string;

import java.util.HashMap;
import java.util.Map;

public class Occurance_Word_count_string {

	public static void main(String[] args) {

		
		word_count("Namrata Arun Shete namrata");
		
				
	}
	public static void word_count(String str1)
	{
		String str=str1.toLowerCase();
		Map<String, Integer> Mapstr=new HashMap<String, Integer>();
		String []word=str.split(" ");
		for(String word2: word)
		{
			if(Mapstr.containsKey(word2))
			{
				Mapstr.put(word2, Mapstr.get(word2)+1);
			}
		else
		{
			Mapstr.put(word2, 1);
		}
			
		}
		System.out.println(Mapstr);
	}

}
