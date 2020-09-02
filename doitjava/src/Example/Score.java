package Example;

import java.util.Scanner;

public class Score {
	/**
	 * 국어 영어 수학 점수를 입력받아서 평균을 출력 한 후 100~91점은 A 등급 90~81은 B등급 80~71은 C등급 나머지는 F등급
	 * 평균점수와 등급을 출력하세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학점수");
		int math = sc.nextInt();
		System.out.println("국어점수");
		int kor = sc.nextInt();
		System.out.println("영어점수");
		int eng = sc.nextInt();
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		char grade = 0;
		System.out.println("평균 점수는" + avg + "입니다");

		
//		if(avg>=91) {
//			grade='A';
//		}else if(avg<91 && avg>=81) {
//			grade='B';
//		}else if(avg<81 && avg>=71) {
//			grade='C';
//		}else
//			grade='F';
//		
//		
		
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
			
		}
		System.out.println("등급은"+grade+"등급입니다");		
	}
}
