package c.inheritance;

public class Dog extends Animal {
	public void hungry() {
		System.out.println("배고파용 멍멍");
		super.kind = "dog";
		super.eat();
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.hungry();
	}
}