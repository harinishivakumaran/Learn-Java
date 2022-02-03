
public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputer=new Book(10);
		Book progLang=new Book(5);
		Book laughing=new Book();
		System.out.println(progLang.getNoOfCopies());
		System.out.println(artOfComputer.getNoOfCopies());
		System.out.println(laughing.getNoOfCopies());
		//artOfComputer.setNoOfCopies(10);
		//progLang.setNoOfCopies(5);
		artOfComputer.increaseNoOfCopies(20);
		progLang.increaseNoOfCopies(29);
		System.out.println(progLang.getNoOfCopies());
		System.out.println(artOfComputer.getNoOfCopies());
	}

}
