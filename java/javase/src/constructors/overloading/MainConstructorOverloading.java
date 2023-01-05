package constructors.overloading;

public class MainConstructorOverloading {
	public static void main(String[] args) {
		Book java = new Book();
		
		Book html = new Book(10);
		
		Book css = new Book(10,"CSS");
		System.out.println(css.price);
		
	}

}
