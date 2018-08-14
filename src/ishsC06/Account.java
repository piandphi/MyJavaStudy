package ishsC06;

public class Account {
	String name;
	String accNo;
	int jan;
	
	
	void deposit(int money) {
		System.out.println(money + "원을 입금합니다.");
		jan += money;
	}
	
	void withdraw(int money) {
		jan -= money;
	}
	
	void checkAccount() {
		System.out.println("예금주 : " + name + "(계좌번호 : " + accNo+")");
		System.out.println("잔액 : " + jan);
	}
	
	void checkJan() {
		System.out.println("잔액 : " + jan);

}
