package Example;

import java.util.Scanner;

public class Exam14g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
			System.out.println("�� ���� ����ұ��?(Ȧ���� �Է�)");
			line = sc.nextInt();
		}while(line%2==0);
		int upLine = line/2;
		int downLine = line - upLine;
		
		for(int i = 0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = downLine - 1 ; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			sc.close();
	}

}
