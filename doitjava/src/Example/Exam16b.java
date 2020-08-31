package Example;

import java.util.Scanner;

public class Exam16b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n-1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=2 * i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
