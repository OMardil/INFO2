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
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
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
		return arrivalDate;
	}

	public void setArrivalDate(HotelDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public HotelDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(HotelDate departureDate) {
		this.departureDate = departureDate;
	}

	public Room getRoomNumber() {
		return room;
	}

	public void setRoomNumber(Room roomNumber) {
		this.room = roomNumber;
	}

	public void generateInvoice() {
		// to be implemented
	}

}
