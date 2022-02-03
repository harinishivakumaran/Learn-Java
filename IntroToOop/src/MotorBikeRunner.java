
public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBikes honda=new MotorBikes();
		MotorBikes ducati=new MotorBikes();
		ducati.start();
		honda.start();
		ducati.setSpeed(130);
		ducati.increaseSpeed(50);
		ducati.decreaseSpeed(200);
		//int ducatiSpeed=ducati.getSpeed();
		//ducatiSpeed += 50;
		//ducati.setSpeed(ducatiSpeed);
		honda.setSpeed(80);
		honda.increaseSpeed(50);
		honda.decreaseSpeed(10);
		//int hondaSpeed=honda.getSpeed();
		//hondaSpeed += 30;
		//honda.setSpeed(hondaSpeed);
		//ducati.getSpeed();
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
	}

}
