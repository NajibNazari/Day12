package variables;

public class VariableRecap {

	String name;
	
	public static String country;
	
	public static void main(String[] args) {


		int count = 10;
		

	}

	public static void getInfo() {
		// ERROR expected because we cannot access local variable from another method 
		// System.out.println(count); // count declared inside main method body
	}
}
