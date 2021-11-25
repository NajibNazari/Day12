package variables;
//INSTANCE VARIABLE EXAMPLE
public class Employee {

	//instance variable 
	int id;
	double salary;
	
	public static void main (String [] args) {
		
		// creating 3 Employee Class Object
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.id = 1;
		e1.salary = 11.11;
		
		e2.id = 2;
		e2.salary = 22.222;
		
		e3.id = 3;
		e3.salary = 33.33;
		
		System.out.println(e1.id);
		System.out.println(e2.id);
		System.out.println(e3.id);
		
		//NOTE** Each object will have its own copy version of instance variable 
	}
}
