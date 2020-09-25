package chapter13;

public class TestMyNumber {

	public static void main(String[] args) {
//		MyNumber max = (x,y) -> (x>=y)? x:y;  //���ٽ��� �������̽��� max������ ����
//		System.out.println(max.getMax(10, 20)); //�������̽��� ������ �޼��� ȣ��
		
		
		//Ŭ���� ����� ��ü����
		int num1 = 10;
		int num2 =20;
		ImplNumber in = new ImplNumber();
		int result = in.getMax(num1, num2);
		System.out.println(result);
		
		
		//�͸� ���� ��ü ����
		MyNumber in2  = new MyNumber() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1>=num2 ? num1:num2;
			}
		};
		result = in2.getMax(num1, num2);
		System.out.println("in2:" + result);
		
		
		//���ٽ� ���
		MyNumber in3 = (x, y) -> x>=y ? x:y;
		result = in3.getMax(num1, num2);
		System.out.println("in3:" + result);
	}
}
