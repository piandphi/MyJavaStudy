package ishsC06;

public class Account {
	String name;
	String accNo;
	int jan;
	
	
	void deposit(int money) {
		jan += money;
	}
	
	void withdraw(int money) {
		jan -= money;
	}
	
	void checkAccount() {
		System.out.println("������ : " + name);
		System.out.println("���¹�ȣ : " + accNo);
		System.out.println("�ܾ� : " + jan);
	}

}
