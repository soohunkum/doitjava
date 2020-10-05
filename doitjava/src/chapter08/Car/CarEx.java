package chapter08.Car;

public class CarEx {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setModel("그랜저");
		c1.setColor("검정");
//		c1.model="그랜저";  //Car Class에 변수를 private으로 설정해서 오류가 남
//		c1.color="검정";    //Car Class에 변수를 private으로 설정해서 오류가 남
		
		c1.info();
	}

}
