package chapter04;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		for(int i=2; i<=9; i += 1) {
			for(int times = 1; times<=9; times +=1) {
				System.out.println(i+ "X" + times +" = " + i*times);
			}
		System.out.println();
		}

	}

}
