package chapter08;

public class InstanceofEx {

	public static void method1(ParentInst parent) {
		if(parent instanceof ChildInst) { //��ȯ����Ȯ��
			ChildInst child = (ChildInst)parent;
			System.out.println("method1-Child�� ��ȯ");
		}else {
			System.out.println("method1-Child�� ����");
		}

	}
	public static void method2(ParentInst parent) {
		ChildInst child=(ChildInst) parent; //���ܹ߻�����
		System.out.println("method2-Child�� ��ȯ");
	}
	public static void main(String[] args) {
		ParentInst parentA = new ChildInst();
		method1(parentA);
		method2(parentA);
		ParentInst parentB = new ParentInst();
		method1(parentB); 
		method2(parentB); //���ܹ߻�
	}
}
