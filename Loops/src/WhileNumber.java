
public class WhileNumber {
	private int num;
	
	public WhileNumber(int num) {
		this.num=num;
	}

	public void getSquares() {
		int i=1;
		while(i*i<=num) {
			System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
	}

	public void getCubes() {
		int i=1;
		while(i*i*i<=num) {
			System.out.print(i*i*i+" ");
			i++;
		}
		
	}

}
