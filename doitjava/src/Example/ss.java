package Example;

import java.util.Scanner;

public class ss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int line = sc.nextInt();
			for(int a=0; a<line; a++) {
				for(int b=0; b<line; b++) {
		
					if(b<line-a-1) {
						System.out.print("&");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			sc.close();
	}
}
