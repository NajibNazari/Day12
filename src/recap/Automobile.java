package recap;

public class Automobile {

	// variable
	double fuel;
	double speed;
	String license;
	
	// methods
	public static void accelerate(double pedalPresure) {
		System.out.println("Accelerating ..." + pedalPresure);
	}

	public static void decelerate(double pedalPresure) {
		System.out.println("Decelerating ..." + pedalPresure);
	}
}
