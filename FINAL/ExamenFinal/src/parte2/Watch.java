package parte2;

public class Watch {

	private String watchBrand;
	private int elapsedMinutes;
	private double hoursHandAngle;
	private double minutesHandAngle;

	/*
	 * La clase Watch sirve para representar un reloj analógico. La variable
	 * elapsedMinutes lleva el conteo total de los minutos transcurridos desde que
	 * inició el día. Las variables hoursHand y minutesHand representan el ángulo de
	 * cada manecilla, considerando que 0 representa el inicio a partir del eje Y.
	 * 
	 * 
	 * Por ejemplo, para representar la 1:30AM, las variables almacenarian: -
	 * elapsedMinutes = 90 - hoursHand = 45° - minutesHand = 180°
	 */

	public Watch(String brand) {
		this.watchBrand = brand;
		this.elapsedMinutes = 0;
		this.hoursHandAngle = 0;
		this.minutesHandAngle = 0;
	}

	public void addMinutes(int elapsedMinutes) {
		this.elapsedMinutes += elapsedMinutes;
		updateHands();
	}

	private void updateHands() {
		int temp = this.elapsedMinutes;
		this.hoursHandAngle = 0;
		this.minutesHandAngle = 0;
		updateHands(temp);
		this.hoursHandAngle = this.hoursHandAngle % 360;
		this.minutesHandAngle = this.minutesHandAngle % 360;
	}

	private void updateHands(int remainingMinutes) {
		if (remainingMinutes == 0) {
			return;
		} else if (remainingMinutes < 60) {
			this.minutesHandAngle += 6;
			this.hoursHandAngle += 0.5;
			updateHands(remainingMinutes - 1);
		} else {
			this.hoursHandAngle += 30;
			updateHands(remainingMinutes - 60);
		}
	}

	public String toString() {
		return "Brand: " + this.watchBrand + "\n" + "Hours: " + this.hoursHandAngle + "°\n" + "Minutes: "
				+ this.minutesHandAngle + "°\n";
	}

	public void draw() {
		// watch hands are updated on screen
	}

	public static void main(String[] args) {

		Watch myWatch = new Watch("Apple Watch");
		myWatch.addMinutes(243);
		System.out.println(myWatch);

		Watch appleWatch = new Watch("Apple Watch");
		Watch galaxyWatch = new Watch("Galaxy Watch");
		Watch huaweiWatch = new Watch("Huawei Watch");

		appleWatch.addMinutes(190);
		galaxyWatch.addMinutes(360);
		huaweiWatch.addMinutes(45);

		System.out.println(appleWatch);
		System.out.println(galaxyWatch);
		System.out.println(huaweiWatch);
	}

}
