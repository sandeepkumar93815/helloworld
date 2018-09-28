package algorithms;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
	
	
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(5,1,4,2,8);
		for(int i=1;i<li.size();i++) {
			int temp=li.get(i);
			int count=0;
			for(int j=i-1;j>=0;j--) {
				if(temp<li.get(j)) {
					count++;
					
					
				}
			}	
				
				for(int k=count;k>=1;k--) {
				
					int smallNumber=li.get(i);
					int bigNumber=li.get(i-1);
					li.set(i-1, smallNumber);
					li.set(i, bigNumber);
					i--;
					
				
				}
				
			}
			
		
		for(Integer i:li) {
		System.out.print(i+"  ");
		}
	}

}
