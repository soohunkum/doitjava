package Example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println();
		
		if(num%2==0) {
			System.out.println(num+"은 짝수입니다");
		}else {
			System.out.println(num+"은 홀수입니다");
		}
		
		System.out.println(num%2==0 ? num+"은 짝수입니다" : num+"은 홀수입니다");

		if(num%2==0)System.out.println(num+"은 짝수입니다");
		else System.out.println(num+"은 홀수입니다");
		
		sc.close();
	}

}
