import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test{
	
  
	
	public static void main(String[] args) {
		
    Comparator<Integer> com= new Comparator<Integer>() {
    	@Override
    	public int compare(Integer i1,Integer i2) {
    		System.out.println("other way isssss");
    		return 0;
    	}
	};
		
	Set<Integer> s=new TreeSet<>(com);
   s.add(123);
   s.add(234);
		
	}

	

}
