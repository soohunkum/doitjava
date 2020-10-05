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

		/*static으로 설정되어 있는 '정적맴버'는 
		 *새로운 객체를 생성해서 호출해도 호출이 된다*/
		CalcStatic calc2 = new CalcStatic();
		System.out.println("calc2.pi:" + calc2.pi);
		
		/*static이 설정되어 있지 않은 '인스턴스맴버'는 객체를 생성해서 그 안에 호출해야 된다*/ 
		int result4 = calc2.multiply(3,5);
		System.out.println(result4);
		/*static이 설정된 '정적맴버'는 객체를 생성하지 않고 호출해도 호출이 된다*/
		System.out.println(CalcStatic.pi);
		
//		int num1 = CalcStatic.num1;/*객체를 생성하지 않으면 '인스턴스맴버'는 호출할 수 없다*/
		/*'인스턴스 맴버'는 다른 객체에서 호출하면*/
		int aNum = calc2.num1;
		System.out.println(aNum);
		int bNum = calcs.num1;
		System.out.println(bNum);
}
}
