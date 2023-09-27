package ders8;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Methods m = new Methods();
		System.out.println("print my number");
		Scanner ss = new Scanner(System.in);
		int count = ss.nextInt();
		m.PrintName(count, "Vali");
		m.PrintName(5, "vali");
		ss.close();
	}

	void PrintName(int count, String name) {
		for (int i = 1; i <= count; i++) {
			System.out.println(name);
		}
	}

}
