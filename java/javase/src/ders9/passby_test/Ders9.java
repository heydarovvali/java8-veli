package ders9.passby_test;

public class Ders9 {
	public static void main(String[] args) {

		Bank myBank = new Bank(100);
		Product alma = new Product("Alma",2.5);
		Product alca = new Product("Alca",3.5);
		Product banan = new Product("Banan",4);

		myBank.showBalance();

		Shopping shopping = new Shopping();
		shopping.shop(myBank, alma, 2);
		shopping.shop(myBank, banan, 1.2);

		myBank.showBalance();

	}
}
