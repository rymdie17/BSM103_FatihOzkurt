package mazeretSinavi;

public class ReferanceMystery2 {

	public static void main(String[] args) {
		int hp = 10;
		Pokemon squirtle = new Pokemon(5);
		
		battle(squirtle, hp);
		System.out.println("Level " + squirtle.level + "," + hp + " hp");
		
		hp += squirtle.level;
		
		battle(squirtle, hp+1);
		System.out.println("Level " + squirtle.level + "," + hp + " hp");
	}
	
	private static void battle(Pokemon poke, int hp) {
		poke.level++;
		hp -=5;
		System.out.println("Level " + poke.level + "," + hp + " hp");
	}

}

class Pokemon {
	int level;
	
	public Pokemon(int level) {
		this.level = level;
	}
}