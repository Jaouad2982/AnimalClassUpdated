/*
* All Cats are Animals but all Animals are not Cats
*/
public class Cat extends Animal {
public Cat()
{
//super();
System.out.println("Now I am a Cat!");
}

@Override
public String sleep() {
	return "A cat sleeps more than anythong else ...";
}

@Override
public String eat() {
	return "A cat eats but not as much as a dog...";
}
public String mewo(){
	return "meow meow is there any food, I am hungry again.....?";
}

public String purr(){
	return "purrr...";
}

}

