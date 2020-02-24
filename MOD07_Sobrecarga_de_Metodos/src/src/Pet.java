
public class Pet {

	public static void main(String[] args) {
		Pet aPet = new Pet();
		Pet myCat = new Pet("Fluffy", 2, 4.5);
		Pet myDog = new Pet("Spot");
		Pet myTurtle = new Pet(20);
		Pet myHorse = new Pet(750.5);
	}
	
	

	public Pet() {} 
	public Pet(String initialName, int initialAge, double initialWeight) {}
	public Pet(String initialName) {}
	public Pet(int initialAge) {}
	public Pet(double initialWeight) {}
	

}
