package Occurance;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerRepeatedcount {

	public static void main(String[] args) {
		getcount(1);

	}
	public static void getcount(int number)
	{
				
		System.out.println("Given number=>"+number);
		
		
		if(String.valueOf(number).length()==1)
        {
        	System.out.println(number+"=>"+1);
       return;
        }

		Map<Long, Integer> Mapint=new HashMap<Long, Integer>();
		while(number>0)
		{
		long lastdigit=number % 10;
		
		if(Mapint.containsKey(lastdigit))
		{
			Mapint.put(lastdigit, Mapint.get(lastdigit)+1);
		}
		else
		{
			Mapint.put(lastdigit, 1);
		}
		number=number/10;
		
		}
		Set<Long> keys=Mapint.keySet();	
		for(Long key:keys)
		{
			
			System.out.println(key+"=> "+Mapint.get(key));
		}
		
	}
	

}
