package com.practice.tictactoegame;

import java.util.*;

public class TicTacToeGame {
	private static Scanner sc = new Scanner(System.in);
	private static char[] board;
	private static char player;
	private static char computer;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game");
		board = new char[10];
		char turn;
		printBoard();
		initializeBoard();
		turn = chooseHeadsOrTails() ? player : computer;
		System.out.println((player == 'X') ? "Player will start the game" : "Computer will start the game");
		fullGame(turn);
		sc.close();
	}

	private static void fullGame(char turn) {
		boolean winner = false;
		int count = 0;
		while (winner == false) {
			if (count == 9) {
				System.out.println("Draw");
				break;
			}
			else if (turn == player) {
				System.out.println("\nPlayer turn");
				turn = startGamePlayer(turn);
				printBoard();
				winner = checkWinner(player);
				if(winner == true)
					System.out.println("Player Win !!!!");
				if (turn == computer)
					count += 1;
				continue;
			} 
			else if (turn == computer) {
				System.out.println("\nComputer turn");
				turn = startGameComputer(turn);
				printBoard();
				winner = checkWinner(computer);
				if(winner == true)
					System.out.println("Computer Win !!!!");
				if (turn == player)
					count += 1;
				continue;
			} 
		}
	}

	// UC8 Computer case
	private static char startGameComputer(char turn) {
		System.out.println("Enter position between 1 to 9: ");
		int position = 1 + (int) Math.floor(Math.random() * 10) % 9;
		if (checkValidMove(position) == true) {
			board[position] = turn;
			turn = (turn == player) ? computer : player;
		} else {
			System.out.println("Invalid move Enter again");
		}
		return turn;
	}

	// UC7 check Winning condition
	private static boolean checkWinner(char ch) {
		return ((board[1] == ch && board[2] == ch && board[3] == ch)
				|| (board[4] == ch && board[5] == ch && board[6] == ch)
				|| (board[7] == ch && board[8] == ch && board[9] == ch)
				|| (board[1] == ch && board[4] == ch && board[7] == ch)
				|| (board[2] == ch && board[5] == ch && board[8] == ch)
				|| (board[3] == ch && board[6] == ch && board[9] == ch)
				|| (board[1] == ch && board[5] == ch && board[9] == ch)
				|| (board[7] == ch && board[5] == ch && board[3] == ch));
	}

	// UC5 first move in the game
	private static char startGamePlayer(char turn) {
		System.out.println("Enter position between 1 to 9: ");
		int position = sc.nextInt();
		if (checkValidMove(position) == true) {
			board[position] = turn;
			turn = (turn == player) ? computer : player;
		} else {
			System.out.println("Invalid move Enter again");
		}
		return turn;
	}

	// UC4 check if move is valid
	private static boolean checkValidMove(int position) {
		return (board[position] == ' ') ? true : false;
	}

	// UC3 To get a board view
	private static void printBoard() {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("--------------");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("--------------");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}

	// UC2 and UC6 input from user
	private static boolean chooseHeadsOrTails() {
		boolean winToss = false;
		System.out.println("Choose 0 for head and 1 for tail ");
		int toss = sc.nextInt();
		int options = (int) Math.floor(Math.random() * 10) % 2;
		if (toss == options) {
			player = 'X';
			computer = 'O';
			winToss = true;
		} else {
			player = 'O';
			computer = 'X';
		}
		return winToss;
	}

	// UC1 Initialize board with empty spaces
	private static void initializeBoard() {
		Arrays.fill(board, ' ');
	}
}
