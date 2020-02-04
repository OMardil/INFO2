package casino;

import java.time.LocalDate;
import java.time.Period;

public class Player {

	public String name; //player name
	private int age;    //player age
	private double balance; //player balance $$
	//if account is valid, activeAccount == true.
	private boolean activeAccount;
	public double lastBetAmount; //last bet $$$
	public int lastBetNumber;    //selected number
	
	public Player(String name, LocalDate birthDate) {
		
	}
	
	public void addFunds(double amount) {

	}
	
	public void withrawFunds(double amount) {

	}
	
	public void bet(double betAmount, int betNumber) {
		
	}

	public boolean isActiveAccount() {
		return this.activeAccount;
	} 
	
}
