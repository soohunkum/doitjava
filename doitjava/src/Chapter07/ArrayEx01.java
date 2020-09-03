package Chapter07;

public class ArrayEx01 {

	public static void main(String[] args) {
		int score1 = 1, score2 = 2, score3 = 3, score4 = 4, score5 = 5;
		int sum = 0;
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		System.out.println(sum);
		
		
		sum=0;
		int[]scores = {1,2,3,4,6};
		System.out.println(scores.length);
		for(int i=0 ;i<scores.length; i++) {
		sum += scores[i];
		}
		System.out.println(sum);

	}
}

