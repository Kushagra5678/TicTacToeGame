package com.practice.ticTacToeGame;
import java.util.*;
public class TicTacToeGame {
	static Scanner sc;
	private static char[] board;
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game");
		board=new char[10];
		initializeBoard();
		char player1=chooseInput();
		char computer=(player1=='X')? 'O': 'X';
		printBoard(board);
		sc.close();
	}
	// To get a game view UC3
	private static void printBoard(char[] board) {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("--------------");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("--------------");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}
	//UC2
	private static char chooseInput() {
		sc=new Scanner(System.in);
		System.out.println("Choose X or O:");
		char player1=sc.next().charAt(0);
		if(player1=='X')
			player1='X';
		else if(player1=='O')
			player1='O';
		return player1;
	}
	//UC1
	private static void initializeBoard() {
		Arrays.fill(board, ' ');
	}
}

