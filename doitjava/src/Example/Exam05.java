package Example;

public class Exam05 {
	public static void main(String[] args) {
		
		
		int sum=0;
		int i=1;
		for(i=1; i<=50; i++) {
			if(i%3==0) {
				sum+=i;
			}else {
				continue;
				}
			}
		System.out.println(sum);
	
}
}
//1부터 50까지의 수 중 3의 배수의 합
