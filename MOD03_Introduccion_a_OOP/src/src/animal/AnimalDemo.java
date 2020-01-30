package animal;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal rhino = new Animal();
		rhino.name = "Sally";
		rhino.race = "White Rhino";
		rhino.hunger = 5; //very hungry!
		rhino.food = new String[]{"fruit", "bushes", "grass"};
		
		
		Animal bear = new Animal();
		bear.name = "Yogi";
		bear.race = "Grizzly";
		bear.hunger = 3; //moderate
		bear.food   = new String[] {"fish", "berries"};
		
	}

}
