package ders11;

public class Qeydiyyat {

	void qeydEt(String name, String surname, int age) {
		if (name.equals("")) {
			System.out.println("adi bos qoyma!!");
			return;
		}

		if (surname.equals("")) {
			System.out.println("soyadi bos qoyma!!");
			return;
		}

		if (age < 18) {
			System.out.println("yas min 18 olmalidir!!");
			return;
		}

		System.out.println("qeydiyyat tamamlandi");
	}
}
