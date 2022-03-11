package catExample;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.color = "sari";
		System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age);
		
		Cat cat2 = new Cat("tekir", 5);
		System.out.println(cat2.name + ", " + cat2.color + ", " + cat2.age);
		
		Cat cat3 = new Cat("tekir", "siyah", 5);
		System.out.println(cat3.name + ", " + cat3.color + ", " + cat3.age);

	}

}
