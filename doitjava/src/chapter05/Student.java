package chapter05;

public class Student {
	/*�ʵ� - �ɹ� ����*/
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*������ - ��ü�� ������ �� �����ϴ� ���*/
	/*�������� �����ε�*/
	Student(int num1, long num2){ 
		System.out.println("student ��ü�� �����մϴ�.");
	} 
	
	Student(int num1, int num2){ 
		System.out.println("student ��ü�� �����մϴ�.");
	} 
	Student(long num1, int num2){ 
		System.out.println("student ��ü�� �����մϴ�.");
	} 
	
	Student(int num){ 
		System.out.println("student ��ü�� �����մϴ�." + num);
	}  
	
	Student(long num){ 
		System.out.println("student ��ü�� �����մϴ�." + num);
	}
	
	Student(){ //�Ű������� ���� ������
		System.out.println("����Ʈ �����ڷ� student ��ü�� �����մϴ�.");
	}
	
	
//	Student(){}  //����Ʈ ������ : �����ڸ� ������� ������ �ڵ����� ����
	//����Ʈ �����ڴ� �Ű������� ���� �����ڵ尡 ���� ������
	
	
	/*�żҵ� - �ɹ� �Լ�*/
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}
