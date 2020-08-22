package chapter04;

import java.util.Scanner;

public class ScannerPracatice {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int iNum;
		System.out.println("숫자를 입력해주세요");
		System.out.println("->");
		iNum = sc.nextInt();
		System.out.println("입력한 숫자는" + iNum + "입니다");
		
//		
//		System.out.println("문자열을 입력해주세요");
//		System.out.println("->");
//		String str =sc.nextLine();
//		System.out.println("입력한 문자열은"+str+ """"입니다");
		
		sc.close();
	}
}
