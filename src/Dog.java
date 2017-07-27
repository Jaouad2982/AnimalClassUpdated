/*
* All Birds are Animals but all Animals are not Birds
*/
public class Dog extends Animal {
	private int time;
	
	public Dog() {
		time = 9;
		// super();
		System.out.println("A dog has been created..");
	}
	@Override
	public String bark() {
		return "A dog bark more than anything";
	}

	@Override
	public String eat() {
		return "My dog eats too much, I should sell him...";
	}

	public String sleepyHead(int time) {
		return "the dog sleeps more than " + time + " hours everyday" + " \n " + "----------";
	}

}
