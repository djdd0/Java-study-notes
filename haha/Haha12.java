package haha;

import java.math.BigDecimal;

public class Haha12 {

	private static double getDoubleNumber(String str){
		double number = 0;
		BigDecimal bd = new BigDecimal(str);  
	    number =  Double.parseDouble(bd.toPlainString());
		
		return number;
	}

    public static void main(String[] args) {
    	System.out.println(getDoubleNumber("+3.00406268E-04")*1000000000);
    }

}
