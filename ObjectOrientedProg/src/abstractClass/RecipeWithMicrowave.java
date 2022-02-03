package abstractClass;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get the stuff ready");
		System.out.println("Put in the microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Cleanup the utensils");		
		System.out.println("Switch on the microwave");
	}

}
