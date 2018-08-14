package ishsC06;

public class BuildigTest {

	public static void main(String[] args) {
		Building kimpo = new Building();
		kimpo.name = "국제선타워";
		kimpo.address = "김포동";
		kimpo.floor = "5";
		
		kimpo.moveEv();
		System.out.println(kimpo.address);

	}

}
