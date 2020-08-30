package Example;

import java.util.Scanner;

public class Exam18e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?:");
		int line = sc.nextInt();
		for (int a = 0; a < line; a++) {
			for (int b = 0; b < line ; b++) {
				if(a==b) {
				System.out.print("@");
			}else {
			System.out.print("$");
		}  
			}				
				System.out.println();
			}
		sc.close();
}
	}

