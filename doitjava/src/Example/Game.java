package Example;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڴ� �����ΰ���?");
		int com = (int)(Math.random()*100);
		System.out.println(com);
			
		
			 for(int n=1;; n++) {
				 System.out.println("���ڸ� �Է��ϼ���");
				 int user = sc.nextInt();
				if(com < user) {
					System.out.println("low");
				}else if(com > user) {
					System.out.println("high");
				}else if(com==user) {
					System.out.println(n+"ȸ��������");
					break;
				}
			}
		
		

	}

}
