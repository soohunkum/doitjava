package Example;

public class Exam07 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		for(a=1; a<=50; a++) {
			if(a%3!=0) {
				continue;
			}else  b++;
		}
			System.out.println(b);

	}

}

//1���� 50������ �� �� 3�� ����� ����