package objCasting;


class Vehicles {
	//Class 1//Parent class
}

class Car extends Vehicles {
	//Class 2//Child class
	 static void method(Vehicles v)
	 {
	     if (v instanceof Car) {
	
	         // Downcasting
	         Car c = (Car)v;
	         System.out.println("Downcasting performed");
	     }
	}
}
public class DownCasting {

	public static void main(String[] args) {
		// Creating an object of Vehicle class
        // and referring it to Car class
        Vehicles v = new Car();
        Car.method(v);
	}

}
