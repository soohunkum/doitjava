
package Example;

import java.util.Scanner;

public class Exam13a {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?:");
		int line = sc.nextInt();
		for (int a = line-1; a >=0 ; a--) {
			for (int b = 0; b <=a; b++) {
				if(b%2==0) {
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


