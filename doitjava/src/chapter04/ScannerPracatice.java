package chapter04;

import java.util.Scanner;

public class ScannerPracatice {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int iNum;
		System.out.println("���ڸ� �Է����ּ���");
		System.out.println("->");
		iNum = sc.nextInt();
		System.out.println("�Է��� ���ڴ�" + iNum + "�Դϴ�");
		
//		
//		System.out.println("���ڿ��� �Է����ּ���");
//		System.out.println("->");
//		String str =sc.nextLine();
//		System.out.println("�Է��� ���ڿ���"+str+ """"�Դϴ�");
		
		sc.close();
	}
}
