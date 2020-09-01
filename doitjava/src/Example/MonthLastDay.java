package Example;

import java.util.Scanner;

public class MonthLastDay {

	public static void main(String[] args) {
		//달의 마지막 일자를 출력하는 프로그램을 작성하세요
		//switch case 구문을 사용해야 합니다
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31;
		break;
		case 2:
			day=28;
		break;
		default:
			day=30;
		}
		System.out.println(month+"월의 마지막 일자는" + day+"일 입니다");
		sc.close();
	}

}
