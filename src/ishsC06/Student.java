package ishsC06;

public class Student {
	String name = "ȫ�浿";
	String Id = "S001";
	int kor = 94;
	int eng = 80;
	int mas = 84;
	
	
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
	
	void changeId(String newId) {
		Id = newId;
	}

}
