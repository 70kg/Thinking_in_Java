package the_eighth;

import java.math.BigDecimal;

public class JobTest {
	public static void main(String[] args) {
		int i = 8888;
		double x = (double)i;
		double j= x/10000;
		
		BigDecimal   b   =   new   BigDecimal(j);  
		double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();  

		System.out.println(f1+"");
	}
}
