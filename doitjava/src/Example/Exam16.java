package Example;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?:");
		int line = sc.nextInt();
			for (int a = 0; a < line; a++) {
			for (int b = 0; b <= line; b++) {
				System.out.print("");
			}else {
			System.out.print("*");
		}
			
				for(int b=0; b<a; b++) {
				System.out.println("*");
			}
		sc.close();
	}

}
}
	

