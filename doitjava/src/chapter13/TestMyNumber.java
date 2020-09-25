package chapter13;

public class TestMyNumber {

	public static void main(String[] args) {
//		MyNumber max = (x,y) -> (x>=y)? x:y;  //람다식을 인터페이스형 max변수에 대입
//		System.out.println(max.getMax(10, 20)); //인터페이스형 변수로 메서드 호출
		
		
		//클래스 기반의 객체생성
		int num1 = 10;
		int num2 =20;
		ImplNumber in = new ImplNumber();
		int result = in.getMax(num1, num2);
		System.out.println(result);
		
		
		//익명 구현 객체 생성
		MyNumber in2  = new MyNumber() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1>=num2 ? num1:num2;
			}
		};
		result = in2.getMax(num1, num2);
		System.out.println("in2:" + result);
		
		
		//람다식 사용
		MyNumber in3 = (x, y) -> x>=y ? x:y;
		result = in3.getMax(num1, num2);
		System.out.println("in3:" + result);
	}
}
