package chapter05;

public class CalcOver {
	
	
		/*매소드의 오버로드*/
	
		//정사각형의 넓이
		double areaRectangle(double width) {
			return width*width;
		}
		
		//직사각형의 넓이
		double areaRectangle(double width, double height) {
			return width*height;
		}
}
