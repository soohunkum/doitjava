package chapter10.Vehicle;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//�Ű����� �ڵ� Ÿ�Ժ�ȯ
		driver.drive(bus);  //Vehicle vehicle = bus;
		driver.drive(taxi); //Vehicle vehicle = taxi;

	}

}
