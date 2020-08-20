package chapter04;

public class DiceEx2 {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		
			switch(dice) {
			case 1:
				System.out.println("주사위의 눈금은 1 입니다");
				break;
			case 2:
				System.out.println("주사위의 눈금은 2 입니다");
				break;
			case 3:
				System.out.println("주사위의 눈금은 3 입니다");
				break;
			case 4:
				System.out.println("주사위의 눈금은 4 입니다");
				break;
			case 5:
				System.out.println("주사위의 눈금은 5 입니다");
				break;
			default:
				System.out.println("주사위의 눈금은 6 입니다");
		

				
		}
		
	}
}

/**
 * Math.random()의 범위는 0보다 크거나 같고 1보다 작은 수가 나온다.
 * 
 * 0 < = Math.random() < 1 0 * 6 + 1< = Math.random() * 6 + 1 < 1 * 6 + 1
 */
