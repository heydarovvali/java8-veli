package enum_examples;

import java.util.EnumSet;

public enum Olculer {

	COX_KICIK("bu olcu en kicik olandir"), KICIK("bu en kicik olandan bir az boyukdur"), ORTA("bu olcu orta olandir"),
	BOYUK("bu olcu boyukden bir az kicik olandir"), COX_BOYUK("bu olcu en boyuk olandir"); // enumun icerisindeki her
																							// bir
																							// deyer ozu bir obyektdir

	private final String desc; // ?

	private Olculer(String desc) { // constructor
		this.desc = desc;
	}

	public String getDesc() { // method
		return desc;

	}

}
