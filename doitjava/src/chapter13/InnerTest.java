package chapter13;

	class OutClass {
		private int num = 10; 
		private static int sNum= 20;
		
		private InClass inClass;
		
		public OutClass() {
			inClass= new InClass();
		}
		
		class InClass{    //인스턴스 내부클래스
			int inNum= 100; //내부 클래스의 인스턴스 변수
			//static int sInNum=200;
			
			void inTest() {
				System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스변수)");
				System.out.println("OutClass sNum = " +num + "(외부클래스의 정적 변수)");
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
				System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
				outClass.usingClass();
			}
		}

