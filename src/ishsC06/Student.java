package ishsC06;

public class Student {
	String name = "홍길동";
	String Id = "S001";
	int kor = 94;
	int eng = 80;
	int mas = 84;
	
	
	int calulateAv() {
		int av = (kor + eng + mas) / 3;
		return av;
	}
	
	void printInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + Id);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mas);
	}
	
	void changeId(String newId) {
		Id = newId;
	}

}
