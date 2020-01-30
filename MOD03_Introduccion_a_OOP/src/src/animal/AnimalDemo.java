package animal;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal rhino = new Animal();
		rhino.name = "Sally";
		rhino.race = "White Rhino";
		rhino.hunger = 10; //very hungry!
		rhino.foods = new String[]{"fruit", "bushes", "grass"};
		
		
		Animal bear = new Animal();
		bear.name = "Yogi";
		bear.race = "Grizzly";
		bear.hunger = 3; //moderate
		bear.foods   = new String[] {"fish", "berries"};
		
		bear.eat("bushes");
		bear.eat("fish");
		bear.eat("berries");
		bear.eat("fruit");
		bear.eat("fish");
		bear.eat("fish");
		
		
	}

}
