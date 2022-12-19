package ders7;

public class Person {

	int age;
	String name;
	
	Person(int a){
		System.out.println(a);
	}
	
	Person (int b, String name){
		for(int i =1; i <=b;i++) {
			System.out.println(name);
		}
	}
}
