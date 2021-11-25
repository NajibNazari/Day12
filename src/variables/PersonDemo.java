package variables;

public class PersonDemo {

	public static void main(String[] args) {


		Person.salary = 1000.00;
		Person.id = 22;
		Person.name = "John";
		
		System.out.println("Salary " + Person.salary);
		System.out.println("ID " + Person.id);
		System.out.println("Name " +Person.name);

	}

}
