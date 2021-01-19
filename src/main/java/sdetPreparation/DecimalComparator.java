package sdetPreparation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {
   
public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

	   BigDecimal aaa = new BigDecimal(String.valueOf(a));	 
	   BigDecimal bbb =new BigDecimal(String.valueOf(b));	
	   
	   aaa = aaa.setScale(3, RoundingMode.DOWN);
	   bbb = bbb.setScale(3, RoundingMode.DOWN);
	   
	   return aaa.equals(bbb);
	   
   }
}
