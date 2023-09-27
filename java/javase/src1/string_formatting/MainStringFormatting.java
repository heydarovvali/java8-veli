package string_formatting;

public class MainStringFormatting {

	 public static void main(String[] args) {
		 String name = "Yusif";
		 int age =29;
		// System.out.println("Hello " + name +" your gae = "+age );
		 System.out.printf("Hello %s, your age = %d %f %c %b",name,age,3.6,'D',true).println();
		 
		 String formattedString = String.format("Hello %s, your age = %d %f %c %b", name,age,3.6,'D',true);
		 System.out.println(formattedString);
		 
		 
		 
		 
		 
		 
		 
	}
}
