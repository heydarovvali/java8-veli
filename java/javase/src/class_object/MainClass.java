package class_object;

public class MainClass {
	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book();

		b1.id = 50;
		b1.name = "Java";
		b1.author = "James Grosling";
		b1.pageCount = 100;
		b1.description = "Program";

		b2.id = 55;
		b2.name = "Cinayet ceza";
		b2.author = "Dostoyevski";
		b2.pageCount = 120;
		b2.description = "Literature";

		System.out.println(b1.id);
		System.out.println(b1.name);
		System.out.println(b1.author);
		System.out.println(b1.pageCount);
		System.out.println(b1.description);

		System.out.println("-----------");

		System.out.println(b2.id);
		System.out.println(b2.name);
		System.out.println(b2.author);
		System.out.println(b2.pageCount);
		System.out.println(b2.description);
	}

}
