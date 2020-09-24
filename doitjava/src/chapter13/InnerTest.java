package chapter13;

	class OutClass {
		private int num = 10; 
		private static int sNum= 20;
		
		private InClass inClass;
		
		public OutClass() {
			inClass= new InClass();
		}
		
		class InClass{    //�ν��Ͻ� ����Ŭ����
			int inNum= 100; //���� Ŭ������ �ν��Ͻ� ����
			//static int sInNum=200;
			
			void inTest() {
				System.out.println("OutClass num = " + num + "(�ܺ�Ŭ������ �ν��Ͻ�����)");
				System.out.println("OutClass sNum = " +num + "(�ܺ�Ŭ������ ���� ����)");
			}
				//static void sTest(){//}
				
			}
			public void usingClass() {
				inClass.inTest();
			}
		}
		
		public class InnerTest{
			public static void main(String[] args) {
				OutClass outClass = new OutClass();
				System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
				outClass.usingClass();
			}
		}

