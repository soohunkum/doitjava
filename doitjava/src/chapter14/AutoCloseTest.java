package chapter14;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			int[]arr = new int[3];
			arr[3] = 100;
		}catch(Exception e) {
			System.out.println("����ó���κ��Դϴ�");
		}

	}

}
