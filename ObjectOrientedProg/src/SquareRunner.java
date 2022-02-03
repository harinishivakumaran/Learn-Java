
class Square{
	private int side;
	Square(int side) {
		this.side=side;
	}
	int getSide() {
		return side;
	}
	void setSide(int side) {
		this.side=side;
	}
	int area() {
		return side*side;
	}
	public String toString() {
		return String.format("Side-%d Area-%d", side, area());
	}
}

public class SquareRunner {

	public static void main(String[] args) {
		Square sq=new Square(10);
		System.out.println(sq);
		System.out.println(sq.getSide());
		sq.setSide(20);
		System.out.println(sq.area());
	}

}
