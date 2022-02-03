package javaInterfaces;

public class ChessGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Moves Up");	
	}

	@Override
	public void down() {
		System.out.println("Moves Down");	
	}

	@Override
	public void left() {
		System.out.println("Moves Left");		
	}

	@Override
	public void right() {
		System.out.println("Moves Right");		
	}

}
