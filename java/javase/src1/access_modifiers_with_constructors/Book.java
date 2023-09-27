package access_modifiers_with_constructors;

public class Book {
	public static void main(String[] args) {
		Book b = new Book();
		b.m();
	}
	private Book() {
      
		System.out.println("Book obyekti yarandi");
	}
	
	void m() {
		Book b = new Book();
	}
}
