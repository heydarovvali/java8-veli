package ders_14;

import java.math.BigInteger;

public class BigIntegerMisal {

	public static void main(String[] args) {

		int simvolSayi = 26;
		BigInteger say = new BigInteger("0");
		for (int i = 2; i <= simvolSayi; i++) {

			BigInteger p = new BigInteger("1");
			for (int j = 1; j <= i; j++) {
				p = p.multiply(new BigInteger(String.valueOf(simvolSayi)));
			}

			say = say.add(p);

		}
		System.out.println(say);
	}

}
