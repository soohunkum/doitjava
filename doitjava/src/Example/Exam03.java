package Example;

public class Exam03 {

	public static void main(String[] args) {
	
		
		int num2 = 0;
		
		for(int num1 = 1; num1 <=10; num1++) { 
				
				num2 += num1; 
		}
			System.out.println(num2);
			
		int i=1;	
		num2=0;
		while(i<=10) {
			num2 += i;
			i++;
		}
		System.out.println(num2);
		
		
		
		int a = 1;
		int b = 0;
		do {b+=a;
			a++;
		}while(a <= 10);
		System.out.println(b);
	}

}
//1���� 10������ ���� ���� �� ���ϱ�  'do while��' 'while��' 'for��' ���
