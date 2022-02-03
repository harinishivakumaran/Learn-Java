package Intro;

//access modifiers -> public, protected, (default), private
//non-access modifiers -> final, static

class Player {
	private String name;
	private static int count=0; //to make the count static 
	//i.e., count variable is shared between multiple instances
	static public int getCount() {
		return count;
	}
	public Player(String name) {
		super();
		this.setName(name);
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player p1=new Player("Mahi");
		System.out.println(Player.getCount());
		Player p2=new Player("Raina");
		//before using getCount method without static
		//System.out.println(p1.getCount()); //this runs even tho its not recommedded
		//System.out.println(p2.getCount());
		
		//static getCount method
		//when static is used the object itself can be used to access its method
		System.out.println(Player.getCount());
		
	}

}
