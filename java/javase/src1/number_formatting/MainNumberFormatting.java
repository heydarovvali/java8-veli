package number_formatting;

import java.text.DecimalFormat;

public class MainNumberFormatting {

	public static void main(String[] args) {

		 double d = 123.87687;
		 String s = String.format("%.2f", d);
		 double d2 = Double.parseDouble(s); //parsedouble setiri edede cevirir yeni doubleye
		 System.out.println(s);
		 
		 int i = Integer.parseInt("33");
		 System.out.println(i);
		 
		 
		 int i1 = 2;
		 String s4=String.format("%05d", i1);
		 System.out.println(s4);
		 
		 
		 
		 DecimalFormat decimalFormat = new DecimalFormat("#.000");
		 int h1 = 345;
		 String s7= decimalFormat.format(h1);
		 System.out.println(s7);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
