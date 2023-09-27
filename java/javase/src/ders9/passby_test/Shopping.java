package ders9.passby_test;

public class Shopping {
	void shop(Bank bank, Product product, double quantity) {
		double totalAmount = product.price * quantity;
		bank.drawMoney(totalAmount);
		System.out.println("alinan mehsul = " + product.name);
		System.out.println("miqdari = " + quantity);
		System.out.println("umumi mebleg = " + totalAmount);
	}
}
