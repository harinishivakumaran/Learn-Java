package abstractClass;

public class ReciperRunner {

	public static void main(String[] args) {
		Recipe1 recipe=new Recipe1();
		recipe.execute();
		RecipeWithMicrowave recipes=new RecipeWithMicrowave();
		recipes.execute();
		
	}

}
