package Example;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성된 숫자는 무엇인가요?");
		int com = (int)(Math.random()*100);
		System.out.println(com);
			
		
			 for(int n=1;; n++) {
				 System.out.println("숫자를 입력하세요");
				 int user = sc.nextInt();
				if(com < user) {
					System.out.println("low");
				}else if(com > user) {
					System.out.println("high");
				}else if(com==user) {
					System.out.println(n+"회만에정답");
					break;
				}
			}
		
		

	}

}
