package methods;

public class MainMethodsParameters {
public static void main(String[] args) {
	MainMethodsParameters m = new MainMethodsParameters();
	m.sayHello(10,"Hello");
	m.sayHello(30,"Salam");
}

public void sayHello(int i,String mesaage) {
	System.out.println(mesaage+" , i = "+i);
}

}
