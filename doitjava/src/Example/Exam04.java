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
//1���� 10������ �� �� 2�� ����� ��