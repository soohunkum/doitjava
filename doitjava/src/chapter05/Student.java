package chapter05;

public class Student {
	/*필드 - 맴버 변수*/
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*생성자 - 객체를 생성할 때 실행하는 블록*/
	/*생성자의 오버로드*/
	Student(int num1, long num2){ 
		System.out.println("student 객체를 생성합니다.");
	} 
	
	Student(int num1, int num2){ 
		System.out.println("student 객체를 생성합니다.");
	} 
	Student(long num1, int num2){ 
		System.out.println("student 객체를 생성합니다.");
	} 
	
	Student(int num){ 
		System.out.println("student 객체를 생성합니다." + num);
	}  
	
	Student(long num){ 
		System.out.println("student 객체를 생성합니다." + num);
	}
	
	Student(){ //매개변수가 없는 생성자
		System.out.println("디폴트 생성자로 student 객체를 생성합니다.");
	}
	
	
//	Student(){}  //디폴트 생성자 : 생성자를 명시하지 않으면 자동으로 생성
	//디폴트 생성자는 매개변수가 없고 실행코드가 없는 생성자
	
	
	/*매소드 - 맴버 함수*/
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}
