package chapter13;


	class OutClass2 {
		private int num = 10;
		private static int sNum = 20;

		static class InStaticClass {
			int inNum = 100;
			static int sInNum = 200;

			void inTest() {
				//num +=10;
				System.out.println("InStaticClass inNum = " + inNum + "(����Ŭ������ �ν��Ͻ� ���� ���)");
				System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
				System.out.println("OutClass sNum = " + sNum + "(�ܺ�Ŭ������ �������� ���)");
			}
			static void sTest() {
				System.out.println("OutClass sNum =" + sNum + "(�ܺ�Ŭ������ �������� ���)");
				System.out.println("InStaticClass sInNum =" + sInNum + "(���� Ŭ������ ���� ���� ���)");
			}
		}
	}

	public class InnerTest2 {
		public static void main(String[] args) {
			OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
			System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
			sInClass.inTest();
			System.out.println();
			System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
			OutClass2.InStaticClass.sTest();
		}
	}

