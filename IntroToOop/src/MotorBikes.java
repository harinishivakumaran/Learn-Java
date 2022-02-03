
public class MotorBikes {
	private int speed;//member variable
	
	
	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int increase) {
		//this.speed= this.speed+increase;
		setSpeed(this.speed+increase);
	}
	
	public void decreaseSpeed(int decrease) {
		//this.speed-=decrease;
		setSpeed(this.speed-decrease); // only positive values
	}
	
	public void setSpeed(int speed) { //the speed accessed becomes local variable in this method setSpeed
		if(speed>0) {	//only desired values can pass(advantage of encapsulation)
			this.speed = speed; // in order to access the member variable this. keyword is used
			
		}
	}

	void start() {
		System.out.println("Bike Started");
	}
}
