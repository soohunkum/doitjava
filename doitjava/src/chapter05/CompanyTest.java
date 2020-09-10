package chapter05;

public class CompanyTest {

	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
        //private으로 설정된 Instance를 외부에서 불러 올 수 없기 때문에
		//내부에서 Instance를 불러오도록 설정된 getInstance매소드를 사용해서 Instance를 불러온다
	}

}
