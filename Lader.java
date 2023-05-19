package task01.practice1;
//0434220117李睿轩
public class Lader {
	private double top;
	private double bottom;
	private double high;
	private double area;
	
	public Lader(double top, double bottom, double high) {
		super();
		this.top = top;
		this.bottom = bottom;
		this.high = high;
		this.area = (top + bottom) * high / 2;
	}
	
	public double getArea() {
		return area;
	}
}
