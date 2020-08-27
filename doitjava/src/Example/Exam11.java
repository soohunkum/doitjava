package Example;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?:");
		int line = sc.nextInt();
		for (int a = line - 1; a < 1; a--) {
			for (int b = 0; b <= a; b++) {
				System.out.print("$");
			}
			System.out.println();
		}

		sc.close();

	}

}
