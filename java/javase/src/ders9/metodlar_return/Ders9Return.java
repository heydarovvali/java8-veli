package ders9.metodlar_return;

public class Ders9Return {
	public static void main(String[] args) {
		Ders9Return o = new Ders9Return();
		o.qeydiyyat("Vali", "Heydarov");
	}

	void qeydiyyat(String name, String surname) {
		if (name.equals("")) {
			System.out.println("adi bos qoymaq olmaz");
			return;
		}
		
		if(surname.equals("")) {
			System.out.println("soyadi bos qoymaq olmaz");
			return;
		}

		if (surname.length() > 10) {
			System.out.println("ad maksimum 10 simvol ola biler");
			return;
		}

		System.out.println(name);
		System.out.println(surname);
	}
}
