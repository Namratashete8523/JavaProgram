package Occurance;

import java.util.HashMap;
import java.util.Map;

public class String_Occurance_of_char_count {

	public static void main(String[] args) {
		
		getcharcount("Namrata Arun Shete");
		
		
	}
	
	public static void getcharcount(String name)
	{
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		String str=name.toLowerCase();
		char []chararr=str.toCharArray();
		
		for(char c : chararr)
		{			
			if(!String.valueOf(c).isBlank())
			{
		if(hm.containsKey(c))
		{ 
			
			hm.put(c, hm. get(c)+1);
			
		}
		else {
			
			hm.put(c, 1);
			
		}					
			}
				
		}
		System.out.println(name + ":"+ hm);
		
	}

}
