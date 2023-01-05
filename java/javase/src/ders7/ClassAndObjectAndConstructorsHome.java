package ders7;

public class ClassAndObjectAndConstructorsHome {
	public static void main(String[] args) {
		 
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Vali");
		Employee emp3 = new Employee("Vali", "Heydarov");
		Employee emp4 = new Employee("Vali ","+99450-536-59-91 ",2000);
		
		//emp1=emp4;
		
		
		System.out.println(emp2.name);
		System.out.println(emp3.name +" "+emp3.surname);
		System.out.println(emp4.name +" "+emp4.phone +" "+emp4.salary);
        
 	}

}
