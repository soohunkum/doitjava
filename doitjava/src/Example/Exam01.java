package Example;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��� �ּ���");
		int num1=sc.nextInt();
		System.out.print("�� ��° ������ �Է��� �ּ���");
		int num2=sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Same");
			
		}else {
			System.out.println("Different");
		}
		
		System.out.println(num1==num2 ? "Same2":"Different2");
		
		if(num1==num2)System.out.println("Same3");
		else System.out.println("Different3");
		
		sc.close();
	
	}
}
