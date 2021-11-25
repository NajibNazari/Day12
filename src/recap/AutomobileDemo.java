package recap;

public class AutomobileDemo {

	public static void main(String[] args) {


		Automobile tsla = new Automobile();
		
		tsla.fuel = 10;
		tsla.speed = 15;
		tsla.license = "123XYZ";
		
		System.out.println("speed -->" + tsla.speed);
		System.out.println("fuel -->" + tsla.fuel);
		System.out.println("license -->" + tsla.license);

		
		// calling methods
		tsla.accelerate(24.34);
		
		tsla.decelerate(44.44);
	}

}
