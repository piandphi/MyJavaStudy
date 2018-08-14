package ishsC06;

public class Building {
	String name;
	String address;
	int floor;
	
	void moveEv() {
		System.out.println("엘리베이터를 운행합니다");
	}
	
	void changeAddress(String newAddress) {
		address = newAddress;
	}
	
}
