package enum_examples;

import java.util.EnumSet;

public class MainEnumExamples {

	public static void main(String[] args) {

		// Olculer olcu = Olculer.BOYUK;
		// System.out.println(olcu);

		for (Olculer olcu : Olculer.values()) {
			System.out.println(olcu + " : " + olcu.getDesc());
		}

		System.out.println("-------------------------------------------");

		for (Olculer olcu : EnumSet.range(Olculer.KICIK, Olculer.BOYUK)) {
			System.out.println(olcu + " : " + olcu.getDesc());
		}

	}
}
