package constructors.overloading;

public class Book {
	String name;
	int price;

	// constructor overloading
	Book(int p) {
		price = p;
		System.out.println("paremetrli-int");
	}

	// ambiguity=conflict
	Book(int p,String n) {
		name = n;
		System.out.println("paremetrli-String");
	}

	Book() {
		System.out.println("parametrsiz");
	}
}
