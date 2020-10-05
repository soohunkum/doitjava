package chapter08.Student;

public class Student extends People{
		//필드
		public int studentNo;
		
		//생성자
		public Student(String name, String ssn, int studentNo) {
			super(name,ssn);//부모생성자호출
			this.studentNo = studentNo;
		}
		
}
