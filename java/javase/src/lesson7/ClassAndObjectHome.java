package lesson7;

public class ClassAndObjectHome {
public static void main(String[] args) {
	Person p1 = new Person("Vali");
	Person p2 = new Person(27);
	
	System.out.println(p1.name);
	System.out.println(p2.age);
}
}
