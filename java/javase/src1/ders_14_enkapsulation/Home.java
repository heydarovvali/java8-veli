package ders_14_enkapsulation;

public class Home {

	private String address = "Baku";
	private String realPassword = "23";

	public String getAddress(String password) {
		if (password.equals(realPassword)) {
			return address;
		} else {
			return "yalnisdir";
		}

	}

}
