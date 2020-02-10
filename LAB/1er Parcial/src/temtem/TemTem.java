package temtem;

public class TemTem {
	
	public static final int NEUTRAL  = 0;
	public static final int FIRE 	 = 1;
	public static final int WATER 	 = 2;	
	public static final int NATURE 	 = 3;	
	public static final int ELECTRIC = 4;	
	
	public static final int HP    = 0;
	public static final int STA   = 1;
	public static final int SPD   = 2;
	public static final int ATK   = 3;
	public static final int DEF   = 4;
	public static final int SPATK = 5;
	public static final int SPDEF = 6;
	
	private int level;
	private int hp;
	private String name;
	private Move[] moveList;
	private int learnedMoves;
	
	private int[] stats;
	
	private static final double[][] damageTypeTable = 
		{{1.0, 1.0, 1.0, 1.0, 1.0},
		 {1.0, 0.5, 0.5, 2.0, 1.0},
		 {1.0, 2.0, 0.5, 0.5, 1.0}, 
		 {1.0, 0.5, 2.0, 0.5, 1.0},
		 {1.0, 1.0, 2.0, 0.5, 0.5}};
	
	public static double damageMultiplier(int typeFrom, int typeTo) {
		return damageTypeTable[typeFrom][typeTo];
	}
	
	public void learnMove(Move m1) {
		if (m1 == null)
			return;
		if (learnedMoves < 4) {
			moveList[learnedMoves++] = m1;
			System.out.println(this.name + " learned " + m1.getMoveName() + "!");
		}
	}
	
	public TemTem(String name, int level, int[] newStats) {
		this.name = name;
		this.level = level;
		this.learnedMoves = 0;
		this.moveList = new Move[4];
		this.stats = new int[7];
		
		for(int i=0; i<newStats.length; i++) {
			this.stats[i] = newStats[i];
		}
	}
	
}
