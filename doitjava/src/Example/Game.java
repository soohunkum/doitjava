package Example;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성된 숫자는 무엇인가요?");
		int com = (int)(Math.random()*100)+1;
		System.out.println(com);
		int user=0;
		int count=0;
		System.out.println("숫자를 입력하세요");
			while(true) {
				user = sc.nextInt();
				count++;
				System.out.println(count + "회 입력하셨습니다");
			
				if(com < user) {
					System.out.println("low");
				}else if(com > user) {
					System.out.println("high");
				}else {
					sc.close();
					break;
				}
			}
			
		

	}
	}



