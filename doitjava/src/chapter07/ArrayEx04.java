package chapter07;

public class ArrayEx04 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
//		arr1 = {10,20,30,40,50};// �߰�ȣ�� �ʱ�ȭ �Ҷ��� ����� �����ϴ�
		
		arr1[0]= 10; //�迭�� ��ҵ��� ��� ����ó�� ����� �����ϴ�
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		int[] arr2 = new int[5];
		arr2 = arr1;   //�迭�� �迭�� ������ �� �ִ�
		System.out.println(arr2.length);
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2 = new int[] {100,200,300};  //���ο� �迭�� ���� �����ϴ� �͵� ����
//		arr2 = {10,20,30}; // �߰�ȣ�� ������ �ʱ�ȭ���� ��밡��
		
	}

}
