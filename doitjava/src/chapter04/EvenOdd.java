package chapter04;

import java.util.Scanner;

/**
 * 숫자를 입력받아서 입력받은 숫자가 홀수인지 짝수인지 출력하세요.
 */
public class EvenOdd {
	public static void main(String[] args) {
	 
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("숫자를 입력해 주세요:");
	  	System.out.print("> ");
	  	
	  	int Num;
	  
	  	Num = sc.nextInt();
	  	
	  	if(Num%2 == 0) {
	  		System.out.println(Num+"은 짝수입니다");

	  	}else {
	  		System.out.println(Num+"은 홀수입니다");
	  	}
	  	sc.close();
	}
}
