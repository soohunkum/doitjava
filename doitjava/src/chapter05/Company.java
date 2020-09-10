package chapter05;

public class Company {
	
		private static Company instance = new Company();  //��ü�� private���� �����Ͽ� ����
		private Company() {}   //�����ڸ� private���� ����
		
		
		/*Company Ŭ������ instance��ü�� �����ϴ� getInstance�żҵ带 public���� ����*/
		public static Company getInstance() {
			if(instance == null) {
				instance = new Company();
			}
			return instance;     //������ instance�̱� ������ getInstance�żҵ忡�� instance�� �ҷ��� �� �ִ�
		}
}
