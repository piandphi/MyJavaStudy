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
		System.out.println("�л��� : " + name);
		System.out.println("���̵� : " + Id);
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + mas);
	}
	
	void changeId(Strng newId) {
		Id = newId;
	}

}
