package catExample;

public class Cat {
	String name;
	String color;
	int age;
	
	public Cat() {
		this.age = 0;
		this.color = "renk girilmedi";
		this.name = "isim girilmedi";
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Cat(String name, String color, int age) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
}
