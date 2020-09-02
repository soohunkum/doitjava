package Example;

import java.util.Scanner;

public class Exam18b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?:");
		int N;
		N=sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N-i-1; j >0 ; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				
				if(j==0 || j==i*2)
				System.out.print("*");
			else 
			System.out.print(" ");
		}  
			System.out.println();
			}				
			for(int i =1; i<N; i++) {
				for(int j=0; j<i*2+1; j++) {
					System.out.print(" ");
				}
				for (int j = N; j>i*2+1; j--) {
					if (j == 0 || j == i * 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		sc.close();
}
	}


