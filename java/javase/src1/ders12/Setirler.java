package ders12;

public class Setirler {

	 public static void main(String[] args) {
		
		  String bookName = "Java programming language";
		  
		  int age =  5;
		  
		  String s = String.valueOf(age);
		  System.out.println(s);
		  
		  String genius = "Jamse".concat(" Gosling"); //setrileri birlewdirme
		  System.out.println(genius);
		  System.out.println(bookName.charAt(7));//setirin istenilen indeksinde olan simvolu tapmaq
		  
		  System.out.println(bookName.endsWith("language"));//setirin verlismis basqa setirle bitmes
		  System.out.println(bookName.equals("Java"));//setirin basqa setire beraber olmasini yoxlamaq
		  System.out.println(bookName.indexOf("g")); //setirin daxilinde basqa setirin necenci indeksde oldugunu tapmaq
		 // bookName = "  ";
		  System.out.println(bookName.isBlank());//setirin bos olmasini yoxlamaq(bosluq simvolunuda bos sayir)
		  System.out.println(bookName.isEmpty());//setirin bos olmasini yoxlamaq
		  System.out.println(bookName.length());
		  System.out.println(bookName.replace("Java", "Python"));//setirin daxilindeki simvollari basqasi ile evez etmek
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}
