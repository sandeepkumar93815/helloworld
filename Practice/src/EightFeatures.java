import java.math.BigDecimal;

public class EightFeatures {
	
public static void test(Object value) {
	System.out.println("value is"+"     "+value);
}
	public static void main(String[] args) {
		
		BigDecimal total=new BigDecimal(1.2345E+7);
	    System.out.println("Total value is"+"      "+total);
		String val=total.toPlainString();
		test(val);
	    
		
	}
}
		