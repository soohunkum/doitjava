package chapter02;

public class PromotionEx {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <-byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //int <- char
		System.out.println("가의 유니코드 :" + intValue);
		
		intValue = '가';
		System.out.println(intValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	
		int result = intValue + byteValue;
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue;

		long longValue = 10000L;
		long res2 = intValue + longValue;
	
	}
}
