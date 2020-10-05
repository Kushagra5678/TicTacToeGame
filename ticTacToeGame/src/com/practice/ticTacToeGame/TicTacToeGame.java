package com.practice.ticTacToeGame;

public class TicTacToeGame {
	public static void main(String[] args) {
		String[] board=new String[10];
		printBoard(board);
	}
	static void printBoard(String board[]) {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("----------------------");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("----------------------");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}
}
