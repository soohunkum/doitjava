package chapter08.Calculator;

public class CalcStatic {
	static double pi = 3.14159;  //�����ɹ�(static)
	int num1 = 10; //�ν��Ͻ� �ɹ�(static���°�)
	int num2 = 20; //�ν��Ͻ� �ɹ�
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	int multiply(int x, int y) {  //�ν��Ͻ� �ɹ�
		return x*y;
	}
}
