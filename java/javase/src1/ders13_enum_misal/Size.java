package ders13_enum_misal;

public enum Size {
 
	SMALL("balaca"),MEDIUM("orta"),LARGE("boyuk");
	
	String info;
	
	Size(String info){
		this.info = info;
	}
}
