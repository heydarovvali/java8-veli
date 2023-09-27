package methods.using_return;

public class MyMethods {
	public void printOddNumber(int number) {
		System.out.println("printOddNumber started");
		if(number%2==0) {
			return;
		}
		
		System.out.println(number);
		System.out.println("printOddNumber ended");
	}
}
