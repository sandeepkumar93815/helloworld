package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingSort {

	
	
	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(0,1,4,2,8,1,4,0);
	
	    Map<Integer, Integer> h=new HashMap();
	    Map<Integer, Integer> map=new HashMap();
		for(int i=0;i<li.size();i++) {
			if(h.get(li.get(i))==null) {
				h.put(li.get(i), 1);
				
			}
			else {
			
				h.put(li.get(i),(h.get(li.get(i))+1));
				
			}
			
			
		
			
		}
		
		for(int i=0;i<=9;i++) {
			if(h.get(i)==null) {
				
				map.put(i, 0);
				
			}
			else {
				
				map.put(i, h.get(i));
			}
			if(i>0) {
			map.put(i, map.get(i)+map.get(i-1));
			}
		}
		
		Map<Integer, Integer> result=new HashMap();
			
		for(int i=0;i<li.size();i++) {
			//System.out.println(map.get(li.get(i)) +"  "+li.get(i));
			result.put(map.get(li.get(i)), li.get(i));
			//System.out.println(li.get(i)+" "+(map.get(li.get(i))-1));
			map.put(li.get(i), map.get(li.get(i))-1);
			
			 
		}
		
		 System.out.println(result);		
	}
}
