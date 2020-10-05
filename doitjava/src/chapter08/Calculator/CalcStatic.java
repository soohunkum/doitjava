package chapter08.Calculator;

public class CalcStatic {
	static double pi = 3.14159;  //정적맴버(static)
	int num1 = 10; //인스턴스 맴버(static없는것)
	int num2 = 20; //인스턴스 맴버
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	int multiply(int x, int y) {  //인스턴스 맴버
		return x*y;
	}
}
