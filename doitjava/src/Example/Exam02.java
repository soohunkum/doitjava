package Example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		System.out.println();
		
		if(num%2==0) {
			System.out.println(num+"�� ¦���Դϴ�");
		}else {
			System.out.println(num+"�� Ȧ���Դϴ�");
		}
		
		System.out.println(num%2==0 ? num+"�� ¦���Դϴ�" : num+"�� Ȧ���Դϴ�");

		if(num%2==0)System.out.println(num+"�� ¦���Դϴ�");
		else System.out.println(num+"�� Ȧ���Դϴ�");
		
		sc.close();
	}

}
