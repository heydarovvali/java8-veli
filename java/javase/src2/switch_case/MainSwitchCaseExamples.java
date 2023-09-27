package switch_case;

public class MainSwitchCaseExamples {

	public static void main(String[] args) {

		int studentPoint = 4;
		if (studentPoint == 5) {
			System.out.println("ela");
		} else if (studentPoint == 4) {
			System.out.println("yaxsi");
		} else if (studentPoint == 3) {
			System.out.println("kafi");
		} else if (studentPoint == 2) {
			System.out.println("pis");
		} else {
			System.out.println("duz qiymet verilmeyib");
		}

		switch (studentPoint) {
		case 5: {
			System.out.println("ela");
		}
			break;
		case 4: {
			System.out.println("yaxsi");
		}
			break;
		case 3: {
			System.out.println("kafi");
		}
			break;
		case 2: {
			System.out.println("pis");
		}
			break;
		default: {
			System.out.println("duz qiymet verilmeyib");
		}
		}
	}
}
