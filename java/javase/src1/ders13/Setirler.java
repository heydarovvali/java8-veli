package ders13;

import java.util.Arrays;

public class Setirler {
 
	 public static void main(String[] args) {
		
		  String sentence = "Programming";
		  System.out.println(sentence.toLowerCase());
		  System.out.println(sentence.equalsIgnoreCase("proGrAmminG"));
		  
		  System.out.println("055-554-5454".matches("[0-5]{3}-[0-5]{3}-[0-6]{4}"));
		  System.out.println("Vali@gmail.com".matches("[a-zA-Z]+@[a-z]+\\.[a-z]{3}"));
		  
		  System.out.println(sentence.replaceAll("g","t"));
		  
		  String s = "Java yaxsidir ki yaxsidir ki james yazib ki oyren nese";
		  String[] sozler =s.split("a");
		  System.out.println(Arrays.toString(sozler));
		 
		  
		  s= "Python";
		  System.out.println(s.substring(3));
		  
		  
		  s = "  Developia  ";
		  System.out.println(s.trim());
		  
		  
		 
		
		  
		  
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}
