package chapter08.Calculator;

public class ComputerExtends extends CalculatorExtends{
			@Override
			double areaCircle(double r) {
				System.out.println("Computer ��ü�� areaCircle()");
				return Math.PI*r*r;
			}
}
