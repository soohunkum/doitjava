package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000;  //��ǻ�ʹ� �����(_)�� �ν����� �ʽ��ϴ�.
		short sNum2 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
//		bNum =200; //byte�ڷ����� -128���� 127���� ��밡���մϴ�.
		/*
		 * �ּ�ó�� ����Ű
		 * ��Ʈ�� + ����Ʈ + C
		 * ��Ʈ�� + /
		 * ��Ʈ�� + 7
		 */
//		sNum = 40000; // -32768 ~ 32767���� ��� �����մϴ�.

//		iNum = 2200000000; //-2147483648 ~ 2147483647���� ��� �����մϴ�.
		System.out.println(1_000_000_000); //10�����
		System.out.println(3_000_000_000L); //long�� �ڷ�� ������ L�� ���̴µ� �빮�ڸ� ����ؾ� �մϴ�.
	
		
		long lNum = 3000000000l;
		System.out.println(lNum);
	
	}

}
