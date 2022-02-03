package abstractshapes;
import java.math.*;
public class Sphere extends Shape implements Spatial{
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return (4*Math.PI*radius*radius);
	}

	@Override
	public double volume() {
		return (4*Math.PI*radius*radius*radius)/(3.0);
	}
	
	
}
