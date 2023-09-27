package main_keyword_with_variables;

public class MainStaticKeywordWithVariable {
 
	public static void main(String[] args) {
		Book java = new Book();
		java.price=30;
		
		Book html = new Book();
		html.price=10;
		
		System.out.println("java price = "+java.price);
		System.out.println("html price = "+html.price);
	}
}