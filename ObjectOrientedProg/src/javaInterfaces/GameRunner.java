package javaInterfaces;

public class GameRunner {

	public static void main(String[] args) {
		/*
		//MarioGame game=new MarioGame();
		//ChessGame game=new ChessGame();
		//GamingConsole game=new ChessGame();
		GamingConsole game=new MarioGame(); //can provide same implementation for same interface.
		game.up();
		game.down();
		game.left();
		game.right();
		*/
		GamingConsole[] gaming= {new MarioGame(),new ChessGame()};// two different behaviours
		for(GamingConsole game:gaming) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		//polymorphism -> applies to interfaces as well as inheritance concepts.
	}

}
