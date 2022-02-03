package abstractshapes;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape[] arr=new Shape[5];
		
		for(int i=0;i<5;i++) {
			String sname=sc.next();
			Shape s=null;
			if(sname.equals("Triangle")) {
				double base=sc.nextFloat();
				double height=sc.nextFloat();
				s=new Triangle();
				/*
				Shape shape=new Triangle();
				Triangle tri=(Triangle)shape; //object downcasting
				*/
				((Triangle)s).setBase(base);
				((Triangle)s).setHeight(height);
			}else if(sname.equals("Rectangle")) {
				double length=sc.nextFloat();
				double width=sc.nextFloat();
				s=new Rectangle();
				((Rectangle)s).setLength(length); //object downcasting
				((Rectangle)s).setWidth(width);
			}else if(sname.equals("Cube")) {
				double length=sc.nextFloat();
				double width=sc.nextFloat();
				double height=sc.nextFloat();
				s=new Cube();
				((Cube)s).setLength(length);
				((Cube)s).setWidth(width);
				((Cube)s).setWidth(height);
			}else if(sname.equals("Sphere")) {
				double radius=sc.nextFloat();
				s=new Sphere();
				((Sphere)s).setRadius(radius);
			}
			arr[i]=s;
		}
		for(Shape a:arr) {
			System.out.println("Area "+a.area());
			if(a instanceof Spatial) {
				System.out.println("Volume "+a.volume());
			}
		}
	}
	
}
