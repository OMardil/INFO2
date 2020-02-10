package temtem;

public class Move {
	private int attackDamage;
	private int typeDamage;
	private String moveName;
	
	public Move(String moveName, int attackDamage, int typeDamage) {
		this.moveName = moveName;
		this.attackDamage = attackDamage;
		this.typeDamage = typeDamage;
	}

	public String getMoveName() {
		return moveName;
	}

	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getTypeDamage() {
		return typeDamage;
	}

	public void setTypeDamage(int typeDamage) {
		this.typeDamage = typeDamage;
	}
	
}
