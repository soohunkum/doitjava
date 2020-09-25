package chapter13;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		int num = 10;
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);

		String a1 = "Hello";
		String a2 = "World"; 
		StringConcat concat2 = (s,v) -> System.out.println(s+","+v);
		concat2.makeString(a1, a2); 
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(num);
				System.out.println(s1 + "," + s2);
				
			}
		};
		concat3.makeString(s1, s2);
	}

}
