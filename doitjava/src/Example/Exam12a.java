package Example;

import java.util.Scanner;

public class Exam12a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?:");
		int line = sc.nextInt();
		for (int i = line-1; i >=0; i--) {
			for (int j = 0; j <=i ; j++) {
				if(j%2==0) {
				System.out.print("$");
				}else {
				System.out.print("\\");
				}
			}
			System.out.println();
		}
	
		sc.close();
		

	}
}



