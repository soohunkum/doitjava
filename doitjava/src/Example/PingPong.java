package Example;

public class PingPong {

	public static void main(String[] args) {
		
		int a=1;
		for(a=1; a<=100; a++) {
			if(a%3==0 && a%5==0) {
				System.out.println(a + "ping pong");
			}else if(a%3==0) {
				System.out.println(a+"ping");
			}else if(a%5==0) {
				System.out.println(a+ "pong");
			}else {
				System.out.println(a);
			}
		}
		
		
		
		for(int b=1; b<=100; b++) {
			System.out.print(b+"");
			if(b%3==0) {
				System.out.print("ping");
			}
			if(b%5==0) {
				System.out.println("pong");
			}
			System.out.println();
		}
		
		
		}

	}

//3의 배수에 ping 5의 배수에 pong 15의 배수에 pingpong
