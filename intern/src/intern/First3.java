package intern;

class Trial{
	static int k=10;
}

class First3 {
	
	static int i=10;
	
	public static void main(String[] args) {
		int j;
		//System.out.println("first java program3");
		j=Trial.k++;
		
		System.out.println(j);
		Firsttest obj=new Firsttest();
		obj.statictest();
		Trial.k++;
		System.out.println(Trial.k);
		
	}

}

class Firsttest{
	void statictest() {
		int p;
		//System.out.println("first java program test");
		p=Trial.k++;
		System.out.println(p);
		
	}
}