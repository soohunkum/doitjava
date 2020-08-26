package Example;

public class Exam04 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int num = 1; num<=10; num++) {
			if(num%2!=0) {
				continue;}
				sum+=num;
			
		}
			System.out.println(sum);
			
}
}
//1부터 10까지의 수 중 2의 배수의 합