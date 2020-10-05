package com.practice.ticTacToeGame;
import java.util.*;
public class TicTacToeGame {
	static Scanner sc;
	private static String[] board;
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game");
		board=new String[10];
		printBoard(board);
		String turn=chooseInput();
		sc.close();
	}
	// To get a game view
	private static void printBoard(String board[]) {
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("----------------------");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("----------------------");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}
	private static String chooseInput() {
		System.out.println("Choose X or O:");
		String player1=sc.nextLine();
		if(player1=="X")
			player1="X";
		else if(player1=="O")
			player1="O";
		return player1;
	}
}

