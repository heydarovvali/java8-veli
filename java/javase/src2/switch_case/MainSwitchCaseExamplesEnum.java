package switch_case;

public class MainSwitchCaseExamplesEnum {

	public static void main(String[] args) {
		
		MasinNovu nov = MasinNovu.VARIATOR;

		
		switch(nov) {
		case BENZIN:{System.out.println("benzinli");} break;
		case DIZEL:{System.out.println("dizelli");} break;
		case HIBRIT:{System.out.println("elektrik ve benzinli");} break;
		default:{System.out.println("bu nov bilinmir");}
		}
	}
}
