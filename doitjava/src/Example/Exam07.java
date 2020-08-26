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

//1부터 50까지의 수 중 3의 배수의 갯수