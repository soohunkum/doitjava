package chapter14;

public class ArrayException {
		public static void main(String[] args) {
			try {
			int [] arr = new int[3];
			arr[2] = 100;
			System.out.println("������� �߽��ϴ�");
		
		
		}catch(Exception e) {  //ArithmeticException or ArrayOutOfBoundsException
			System.out.println(e.getMessage());
			System.out.println("�迭�� ������ ����ų� ������꿡 ������ �߻��߽��ϴ�");
			e.printStackTrace();
		}finally {
			System.out.println("���̳θ��� ������ �����ϴ� ���Դϴ�");
		}
		}
}
