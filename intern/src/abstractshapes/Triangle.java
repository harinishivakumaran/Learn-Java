package abstractshapes;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return (base*height)/(2.0);
	}
	@Override
	public double volume() {
		return -1;
	}
}
