package Example;

import java.util.Scanner;

public class Exam11a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?:");
		int line = sc.nextInt();
		for (int a = 0; a < line; a++) {
			for (int b = 0; b <line-a; b++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}

