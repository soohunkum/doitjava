package chapter09.Play;

public class AdvancedLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�");
	}
	
	@Override
	public void jump() {
		System.out.println("���� ���� �մϴ�");
	}
	
	@Override
	public void turn() {
		System.out.println("Turn �� �� ������");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("*****�߱��� �����Դϴ�*****");
	}

}
