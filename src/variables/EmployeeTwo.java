package variables;
//STATIC VARIABLE EXAMPLE
public class EmployeeTwo {
		// Static Variable 
		public static int id;
		public static double salary;
	
	public static void main(String[] args) {

		// creating 3 Employee Class Object
		EmployeeTwo e1 = new EmployeeTwo();
		EmployeeTwo e2 = new EmployeeTwo();
		EmployeeTwo e3 = new EmployeeTwo();
		
		e1.id = 1;
		e1.salary = 11.11;
		
		e2.id = 2;
		e2.salary = 22.222;
		
		e3.id = 3;
		e3.salary = 33.33;
		
	
		System.out.println(e1.id);
		System.out.println(e3.id);
		System.out.println(e2.id);
		
		// NOTE** static variable shared among all objects
	}

}
