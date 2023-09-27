package ders13_enum_misal;

public class EnumMisal {

	public static void main(String[] args) {

		Geyim papaq = new Geyim();
		papaq.color = "qara";
		papaq.price = 40;
		papaq.size = Size.LARGE;
		papaq.printInfo();

		Geyim ayaqqabi = new Geyim();
		ayaqqabi.color = "goy";
		ayaqqabi.price = 500;
		ayaqqabi.size = Size.LARGE;
		ayaqqabi.printInfo();

		Geyim palto = new Geyim();
		palto.color = "yasil";
		palto.price = 5000;
		palto.size = Size.SMALL;
		palto.printInfo();

	}
}
