import java.util.Scanner;

public class AnimalApp {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Animal animal = new Animal();
		print(animal.eat());
		print(animal.bark());
		System.out.println("-------------------");
		Dog dog = new Dog();
		print(dog.bark());
		print(dog.eat());
		System.out.println("How long does he sleep ?");
		int time = scanner.nextInt();
		print(dog.sleepyHead(time));

		Cat cat = new Cat();
		print (cat.sleep());
		print (cat.eat());
		print(cat.mewo());
		print(cat.purr());

	}

	private static void print(String s) {
		System.out.println(s);
	}
}
