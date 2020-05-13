package parte1;

public class Client {
	private int clientID;
	private String clientName;
	private HotelDate arrivalDate;
	private HotelDate departureDate;
	private Room room;

	public Client(int clientID, String clientName, HotelDate arrivalDate, HotelDate departureDate, Room room) {
		this.clientID = clientID;
		this.clientName = clientName;
		this.arrivalDate = arrivalDate.clone();
		this.departureDate = departureDate.clone();
		this.room = room;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public HotelDate getArrivalDate() {
		return arrivalDate.clone();
	}

	public void setArrivalDate(HotelDate arrivalDate) {
		this.arrivalDate = arrivalDate.clone();
	}

	public HotelDate getDepartureDate() {
		return departureDate.clone();
	}

	public void setDepartureDate(HotelDate departureDate) {
		this.departureDate = departureDate.clone();
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Invoice generateInvoice() {
		// to be implemented
		return null;
	}

}
