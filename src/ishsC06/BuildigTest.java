package ishsC06;

public class BuildigTest {

	public static void main(String[] args) {
		Building kimpo = new Building();
		kimpo.name = "������Ÿ��";
		kimpo.address = "������";
		kimpo.floor = "5";
		
		kimpo.moveEv();
		System.out.println(kimpo.address);

	}

}
