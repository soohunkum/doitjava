package Example;

import java.util.Scanner;

public class Between {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���");
		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 2; i <= n; i++) {
			cnt++;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					cnt--;
					break;
				}
			}
		}
			System.out.println("�Է��� ������ �Ҽ��� ������" +cnt+"�� �Դϴ�");
				sc.close();
	}

}
