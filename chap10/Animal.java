package c.inheritance;

public class Animal {
	String name;
	String kind;
	int legCount;
	public static void main(String[] args) {
		
	}
	public void move() {
		
	}
	public void eat() {
		System.out.print("배불러용");
		if(kind == "cat") {
			System.out.println("냐옹 냐옹 행복해냥");
		}
		else if (kind == "dog") {
			System.out.println("멍멍 충성충성");
		}
	}
}