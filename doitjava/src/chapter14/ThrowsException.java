package chapter14;

public class ThrowsException {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("java.lang.String");
		System.out.println("���α׷��� �����մϴ�");
		try {
		throw new ArithmeticException();
	}catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}

}
}