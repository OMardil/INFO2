package animal;

public class Animal {
	
	public String name; 
	public String race;
	public String[] foods; //array with food the animal likes
	public int hunger; //1 -> not hungry, 10 -> very hungry
	
	public void eat(String inputFood) {
		if (hunger <= 0) {
			System.out.println("I'm full!");
			return;
		}
		
		
		//check if Animal eats inputFood
		for(String food: foods) {
			if (food.equals(inputFood)) {
				//When animal eats, hunger is decreased
				hunger--;
				System.out.println("Delicious! I love " + inputFood);
				return;
			}
		}
		
		// Otherwise, 
		System.out.println("I don't like " + inputFood);
	}
	
}
