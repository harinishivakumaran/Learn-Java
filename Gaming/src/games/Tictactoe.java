package games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
	
	static ArrayList<Integer> playerPositions=new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		char[][] gameBoard = { {' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}
				};
		printGameBoard(gameBoard);
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Number:");
			int playerNum=sc.nextInt();
			while(playerPositions.contains(playerNum)||cpuPositions.contains(playerNum)) {
				System.out.println("Poistion taken! Enter a correct Position");
				playerNum=sc.nextInt();
			}
			
			placePiece(gameBoard, playerNum, "player");
			
			String result=checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
			
			Random rand=new Random();
			int cpuNum=rand.nextInt(9)+1;
			
			while(playerPositions.contains(cpuNum)||cpuPositions.contains(cpuNum)) {
				//System.out.println("Poistion taken! Enter a correct Position");
				cpuNum=rand.nextInt(9)+1;
			}
			
			placePiece(gameBoard, cpuNum, "cpu");
			
			printGameBoard(gameBoard);
			
			result=checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
		}
	}

	private static void placePiece(char[][] gameBoard, int number,String user) {
		
		char symbol=' ';
		
		if(user.equals("player")) {
			symbol='X';
			playerPositions.add(number);
		}else if(user.equals("cpu")) {
			symbol='0';
			cpuPositions.add(number);
		}
		
		switch(number) {
			case 1:
				gameBoard[0][0]=symbol;
				break;
			case 2:
				gameBoard[0][2]=symbol;
				break;
			case 3:
				gameBoard[0][4]=symbol;
				break;
			case 4:
				gameBoard[2][0]=symbol;
				break;
			case 5:
				gameBoard[2][2]=symbol;
				break;
			case 6:
				gameBoard[2][4]=symbol;
				break;
			case 7:
				gameBoard[4][0]=symbol;
				break;
			case 8:
				gameBoard[4][2]=symbol;
				break;
			case 9:
				gameBoard[4][4]=symbol;
				break;
			default:
				break;
		}
	}

	public static String checkWinner() {
		
		List topRow=Arrays.asList(1,2,3);
		List midRow=Arrays.asList(4,5,6);
		List botRow=Arrays.asList(7,8,9);
		List leftCol=Arrays.asList(1,4,7);
		List midCol=Arrays.asList(2,5,8);
		List rightCol=Arrays.asList(3,6,9);
		List diagonal1=Arrays.asList(1,5,9);
		List diagonal2=Arrays.asList(7,5,3);
		
		List<List> winning=new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(diagonal1);
		winning.add(diagonal2);
		
		for(List li:winning) {
			if(playerPositions.containsAll(li)) {
				return "Congrats you Won!!!";
			}else if(cpuPositions.containsAll(li)) {
				return "CPU wins! :(";
			}else if(playerPositions.size()+cpuPositions.size() == 9) {
				return "Draw!!";
			}
		}
		return "";	
	}
	
	public static void printGameBoard(char[][] gameBoard) {
		for(char[] row:gameBoard) {
			for(char col:row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
		
}

