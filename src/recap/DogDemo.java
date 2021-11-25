package recap;

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog D = new Dog();

		D.Breed = "Neapolitan Mastiff";
		D.size = "Large";
		D.Age = 5;
		D.Color = "Black";

		System.out.println("Breed " + D.Breed);
		System.out.println("Size " + D.size);
		System.out.println("Age " + D.Age);
		System.out.println("Color " + D.Color);

		System.out.println("**************************");

		Dog D1 = new Dog();

		D1.Breed = "chow Chow";
		D1.size = "Medium";
		D1.Age = 3;
		D1.Color = "Brown";

		System.out.println("Breed--> " + D1.Breed);
		System.out.println("Size--> " + D1.size);
		System.out.println("Age--> " + D1.Age);
		System.out.println("Color--> " + D1.Color);

		System.out.println("**************************");

		Dog D2 = new Dog();

		D2.Breed = "Maltese";
		D2.size = "Small";
		D2.Age = 2;
		D2.Color = "White";

		System.out.println("Breed--> " + D2.Breed);
		System.out.println("Size--> " + D2.size);
		System.out.println("Age--> " + D2.Age);
		System.out.println("Color--> " + D2.Color);

	}

}
