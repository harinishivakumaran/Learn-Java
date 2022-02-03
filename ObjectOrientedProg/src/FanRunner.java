
public class FanRunner {

	public static void main(String[] args) {
		Fan fan=new Fan("M1",0.567,"Black");
		fan.switchOn();
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
