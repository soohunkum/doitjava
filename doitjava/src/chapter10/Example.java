package chapter10;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();  //interfaceA는 methodA만 실행가능
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();  //intefaceB는 methodB만 실행가능
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();  //intefaceC는 모두 호출 가능
	}

}
