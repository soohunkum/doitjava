package chapter07;

public class ArrayEx03 {

	public static void main(String[] args) {
		//10���� �Է��� �� �ִ� �迭 ����, 1~10���� ���� �� for���� ����ؼ� �հ����
		
		int[]arr= new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
			System.out.println(sum);
		
		int arr2[]  = new int[10];
		arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum2=0;
		for(int i=0; i<arr2.length; i++) {
			sum2 += arr2[i];
		}
			System.out.println(sum2);

	}

}
