package Example;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڴ� �����ΰ���?");
		int com = (int)(Math.random()*100)+1;
		System.out.println(com);
		int user=0;
		int count=0;
		System.out.println("���ڸ� �Է��ϼ���");
			while(true) {
				user = sc.nextInt();
				count++;
				System.out.println(count + "ȸ �Է��ϼ̽��ϴ�");
			
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



