package ishsC06;

public class Student {
	String name;
	String Id;
	int kor;
	int eng;
	int mas;
	
	
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
	
	void changeId(Strng newId) {
		Id = newId;
	}

}
