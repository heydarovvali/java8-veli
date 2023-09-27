package ders9.passby_test;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	void drawMoney(double amount) {
		this.balance -= amount;
	}

	void showBalance() {
		System.out.println("cari balans = " + balance);
	}
}
