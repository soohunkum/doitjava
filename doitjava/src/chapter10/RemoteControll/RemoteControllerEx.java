package chapter10.RemoteControll;

public class RemoteControllerEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);;
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	}

}
