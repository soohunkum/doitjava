package chapter08.Student;

public class Person {
	/*�ʵ�*/
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	
	/*������*/
	public Person(String name, int height, double weight, char gender, boolean married) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
	}  
	public Person() {
		this.name = "ȫ�浿";
		this.height = 180;
		this.weight = 175.5;
		this.gender = 'M';
		this.married = false;
	}
	
	
	/*�żҵ�*/
	void printName() {
		System.out.println(this.name);
	}
	void printHeight() {
		System.out.println(this.height);
	}
	void info() {  //���ο� �ִ� �żҵ带 ȣ���Ҷ��� ��ü�� ������ �ʰ� �׳� �żҵ�� ������ ȣ�� �� �� �ִ�
		printName();
		printHeight();
	}
	
}
