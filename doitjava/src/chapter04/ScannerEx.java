package chapter04;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		int iNum;
		Scanner sc = new Scanner(System.in);  //스캐너 생성코드 - 변경 가능한 것은 변수명 뿐입니다
		
//		System.out.println("정수를 입력해 주세요:");
//		System.out.print("> ");
//		iNum = sc.nextInt();
//		System.out.println("입력한 정수:" + iNum);
		
		
//		System.out.println();
		
		
//		System.out.println("실수를 입력해 주세요:");
//		double dNum = sc.nextDouble();
//		System.out.println("입력한 실수:" + dNum);
		
		
//		System.out.println();
		
		
//		System.out.println("실수(f)를 입력해 주세요:");
//		float fNum = sc.nextFloat();
//		System.out.println("입력한 실수(f)" + fNum);
		
		
		System.out.println("문자열을 입력해 주세요:");
//		String str = sc.next();//문자열 입력에는 next()를 사용하지만 공백은 넣을 수 없습니다.
//		                       //스캐너에서 공백은 다음값 입력을 의미합니다.
//		System.out.println("입력한 문자열:" + str);
//		str = sc.next();
//		System.out.println("입력한 문자열:" + str);
//		str = sc.next();
//		System.out.println("입력한 문자열:" + str);
	
		String str = sc.nextLine(); // "nextline()"은 한줄입력가능합니다
		System.out.println("입력한 문자열:" + str);
		
		sc.close();//메모리 누수를 막기 위해 scanner를 더 이상 사용하지 않을때는 닫아줘야 합니다
}
}
