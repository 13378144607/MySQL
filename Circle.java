package task01.practice1;
//0434220117李睿轩
public class Circle {
	private double radium;
	private double area;
	private double perimeter;
	
	//初始化
	public Circle(double radium) {
		this.radium = radium;
		this.area = 2 * Math.PI * radium;
		this.perimeter = Math.PI * radium * radium;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	public double getArea() {
		return area;
	}
}
