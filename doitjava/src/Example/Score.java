package Example;

import java.util.Scanner;

public class Score {
	/**
	 * ���� ���� ���� ������ �Է¹޾Ƽ� ����� ��� �� �� 100~91���� A ��� 90~81�� B��� 80~71�� C��� �������� F���
	 * ��������� ����� ����ϼ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int math = sc.nextInt();
		System.out.println("��������");
		int kor = sc.nextInt();
		System.out.println("��������");
		int eng = sc.nextInt();
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		char grade = 0;
		System.out.println("��� ������" + avg + "�Դϴ�");

		
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
		System.out.println("�����"+grade+"����Դϴ�");		
	}
}
