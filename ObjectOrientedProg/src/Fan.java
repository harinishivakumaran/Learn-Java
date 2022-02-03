
public class Fan {
	//state
	private String make;
	private  double radius;
	private String color;
	private boolean isOn;
	private byte speed;//0 to 5 value
	
	//creation
	public Fan(String make,double radius,String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	public void switchOn() {
		this.isOn=true;
		this.setSpeed((byte)5);//initial speed of fan
		
	}
	public void switchOff() {
		this.isOn=false;
		this.setSpeed((byte)0);
	}
	//public void isOn(boolean isOn) {
		//this.isOn = isOn;
	//}
	public void setSpeed(byte speed) {
		this.speed=speed;
	}		
	//print state
	public String toString() {
		//return "make-"+make+" radius-"+radius+" color-"+color+" isOn-"+isOn+" speed-"+speed;
		return String.format("make-%s radius-%f color-%s isOn-%b speed-%d",make,radius,color,isOn,speed);
	}

}
