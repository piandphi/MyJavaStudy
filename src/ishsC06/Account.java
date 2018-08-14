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
		System.out.println("예금주 : " + name);
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + jan);
	}

}
