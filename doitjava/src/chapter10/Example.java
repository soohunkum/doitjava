package chapter10;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();  //interfaceA�� methodA�� ���డ��
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();  //intefaceB�� methodB�� ���డ��
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();  //intefaceC�� ��� ȣ�� ����
	}

}
