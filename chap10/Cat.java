package c.inheritance;

public class Cat extends Animal {
	public void hungry() {
		System.out.println("배고프다냐옹");
		super.kind = "cat";
		super.eat();
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.hungry();
	}
}