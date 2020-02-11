package temtem;

public class TemTemDemo {

	public static void main(String[] args) {

		int stats[] = new int[]{55,39,65,45,31,67,56};
		TemTem Platypet = new TemTem("Platypet", 1, stats);
		
		Move m1 = new Move("Finbeat", 32, TemTem.NEUTRAL);
		Move m2 = new Move("Water Blade", 52, TemTem.WATER);
		Move m3 = new Move("Venomous Claws", 40, TemTem.WATER);
		Move m4 = new Move("Aqua Bullet Hell", 67, TemTem.WATER);
		
		Platypet.learnMove(m1);
		Platypet.learnMove(m2);
		Platypet.learnMove(m3);
		Platypet.learnMove(m4);
	}

}
