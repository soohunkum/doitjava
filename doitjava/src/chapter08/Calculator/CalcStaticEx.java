package chapter08.Calculator;

public class CalcStaticEx {

	public static void main(String[] args) {
		double result1 = 10*10*CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);
		System.out.println("calcs.pi:" + calcs.pi);

		/*static���� �����Ǿ� �ִ� '�����ɹ�'�� 
		 *���ο� ��ü�� �����ؼ� ȣ���ص� ȣ���� �ȴ�*/
		CalcStatic calc2 = new CalcStatic();
		System.out.println("calc2.pi:" + calc2.pi);
		
		/*static�� �����Ǿ� ���� ���� '�ν��Ͻ��ɹ�'�� ��ü�� �����ؼ� �� �ȿ� ȣ���ؾ� �ȴ�*/ 
		int result4 = calc2.multiply(3,5);
		System.out.println(result4);
		/*static�� ������ '�����ɹ�'�� ��ü�� �������� �ʰ� ȣ���ص� ȣ���� �ȴ�*/
		System.out.println(CalcStatic.pi);
		
//		int num1 = CalcStatic.num1;/*��ü�� �������� ������ '�ν��Ͻ��ɹ�'�� ȣ���� �� ����*/
		/*'�ν��Ͻ� �ɹ�'�� �ٸ� ��ü���� ȣ���ϸ�*/
		int aNum = calc2.num1;
		System.out.println(aNum);
		int bNum = calcs.num1;
		System.out.println(bNum);
}
}
