package ishsC06;

public class Account {
	String name;
	String accNo;
	int jan;
	
	
	void deposit(int money) {
		System.out.println(money + "���� �Ա��մϴ�.");
		jan += money;
	}
	
	void withdraw(int money) {
		jan -= money;
	}
	
	void checkAccount() {
		System.out.println("������ : " + name + "(���¹�ȣ : " + accNo+")");
		System.out.println("�ܾ� : " + jan);
	}
	
	void checkJan() {
		System.out.println("�ܾ� : " + jan);

}
