package com.practice.ticTacToeGame;

import java.util.*;

public class TicTacToeGame {
	private static Scanner sc = new Scanner(System.in);
	private static char[] board;
	private static char player;
	private static char computer;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game");
		board = new char[10];
		initializeBoard();
		computer = (chooseInput() == 'X') ? 'O' : 'X';
		printBoard();
		System.out.println("Player will start the game");
		char turn = player;
		turn = startGame(turn);
		printBoard();
		sc.close();
	}
	//UC5 and UC4 and first move in the game
	private static char startGame(char turn) {
		System.out.println("Enter position between 1 to 9: ");
		int position = sc.nextInt();
		if(board[position] == ' ') {
			board[position] = turn;
			turn= (turn == player) ? computer : player;
		}
		else
			System.out.println("Invalid move Enter again");
		return turn;
	}

	// UC3 To get a board view
	private static void printBoard() {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("--------------");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("--------------");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}

	// UC2 input from user
	private static char chooseInput() {
		System.out.println("Choose X or O:");
		char input = sc.next().charAt(0);
		player = (input == 'X') ? 'X' : 'O';
		return player;
	}

	// UC1 Initialize board with empty spaces
	private static void initializeBoard() {
		Arrays.fill(board, ' ');
	}
}
