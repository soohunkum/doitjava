package chapter05;

public class Company {
	
		private static Company instance = new Company();  //객체를 private으로 설정하여 생성
		private Company() {}   //생성자를 private으로 설정
		
		
		/*Company 클래스에 instance객체를 생성하는 getInstance매소드를 public으로 설정*/
		public static Company getInstance() {
			if(instance == null) {
				instance = new Company();
			}
			return instance;     //내부의 instance이기 때문에 getInstance매소드에서 instance를 불러올 수 있다
		}
}
