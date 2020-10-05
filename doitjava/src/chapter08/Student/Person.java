package chapter08.Student;

public class Person {
	/*필드*/
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	
	/*생성자*/
	public Person(String name, int height, double weight, char gender, boolean married) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
	}  
	public Person() {
		this.name = "홍길동";
		this.height = 180;
		this.weight = 175.5;
		this.gender = 'M';
		this.married = false;
	}
	
	
	/*매소드*/
	void printName() {
		System.out.println(this.name);
	}
	void printHeight() {
		System.out.println(this.height);
	}
	void info() {  //내부에 있는 매소드를 호출할때는 객체를 만들지 않고 그냥 매소드명 만으로 호출 할 수 있다
		printName();
		printHeight();
	}
	
}
