package general;

import java.util.HashMap;
import java.util.Set;

public class PairsEqual {
	public static int equalTo=10;
	
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm= new HashMap<>();
		int[] arr={1,9,2,8,7,7,3,5,5};
		for (int a: arr)
		{
			if(!hm.containsKey(a))
			{
				if(hm.get(a)==null)
					hm.put(a, 1);
				if(hm.get((equalTo-a))!=null && hm.get((equalTo-a)).equals((Integer)1))
				{
					System.out.println(a + "+" + (equalTo-a)+" = "+equalTo);
					hm.put(a, 2);
				}
			}
		}
	}
}