package chapter04;

import java.util.Scanner;

/**
 * ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڰ� Ȧ������ ¦������ ����ϼ���.
 */
public class EvenOdd {
	public static void main(String[] args) {
	 
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("���ڸ� �Է��� �ּ���:");
	  	System.out.print("> ");
	  	
	  	int Num;
	  
	  	Num = sc.nextInt();
	  	
	  	if(Num%2 == 0) {
	  		System.out.println(Num+"�� ¦���Դϴ�");

	  	}else {
	  		System.out.println(Num+"�� Ȧ���Դϴ�");
	  	}
	  	sc.close();
	}
}
