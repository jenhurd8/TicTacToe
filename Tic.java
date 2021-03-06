import java.util.Scanner;

public class Tic {
	static Scanner sc = new Scanner(System.in);
	static int i = 1;
	static String xo = "";
	static int turn = 1;
	static String arr[][][] = {
			{
					{
							"1", "2", "3" }, },
			{
					{
							"4", "5", "6" }, },
			{
					{
							"7", "8", "9" }, },

	};

	static void printGameBoard() {
		System.out.println("  " + arr[0][0][0] + " |" + " " + arr[0][0][1] + " " + "| " + arr[0][0][2]);
		System.out.println("  " + "----------");
		System.out.println("  " + arr[1][0][0] + " |" + " " + arr[1][0][1] + " " + "| " + arr[1][0][2]);
		System.out.println("  " + "----------");
		System.out.println("  " + arr[2][0][0] + " |" + " " + arr[2][0][1] + " " + "| " + arr[2][0][2]);
		System.out.println("");
		System.out.println();
	}

	static void winningMessage() {
		System.out.println(xo + " WINS!!! CONGRATULATIONS!!!");
		System.exit(1);
	}

	static void processChoice() {
		switch (i) {
		case 1:
			if (arr[0][0][0] == "X" || arr[0][0][0] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[0][0][0] = xo;
			break;
		case 2:
			if (arr[0][0][1] == "X" || arr[0][0][1] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[0][0][1] = xo;
			break;
		case 3:
			if (arr[0][0][2] == "X" || arr[0][0][2] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[0][0][2] = xo;
			break;
		case 4:
			if (arr[1][0][0] == "X" || arr[1][0][0] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[1][0][0] = xo;
			break;
		case 5:
			if (arr[1][0][1] == "X" || arr[1][0][1] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[1][0][1] = xo;
			break;
		case 6:
			if (arr[1][0][2] == "X" || arr[1][0][2] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[1][0][2] = xo;
			break;
		case 7:
			if (arr[2][0][0] == "X" || arr[2][0][0] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[2][0][0] = xo;
			break;
		case 8:
			if (arr[2][0][1] == "X" || arr[2][0][1] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[2][0][1] = xo;
			break;
		case 9:
			if (arr[2][0][2] == "X" || arr[2][0][2] == "O") {
				System.out.println("**This number is already taken. Please choose again.**");
				turn--;
				break;
			}
			arr[2][0][2] = xo;
			break;
		}

		// top row matches
		if (arr[0][0][0] == arr[0][0][1] && arr[0][0][1] == arr[0][0][2]) {
			printGameBoard();
			winningMessage();
			// middle row matches
		} else if (arr[1][0][0] == arr[1][0][1] && arr[1][0][1] == arr[1][0][2]) {
			printGameBoard();
			winningMessage();
			// bottom row matches
		} else if (arr[2][0][0] == arr[2][0][1] && arr[2][0][1] == arr[2][0][2]) {
			printGameBoard();
			winningMessage();
			// first row down matches
		} else if (arr[0][0][0] == arr[1][0][0] && arr[1][0][0] == arr[2][0][0]) {
			printGameBoard();
			winningMessage();
			// second row down matches
		} else if (arr[0][0][1] == arr[1][0][1] && arr[1][0][1] == arr[2][0][1]) {
			printGameBoard();
			winningMessage();
			// third row down matches
		} else if (arr[0][0][2] == arr[1][0][2] && arr[1][0][2] == arr[2][0][2]) {
			printGameBoard();
			winningMessage();
			// diagonal from 1-9
		} else if (arr[0][0][0] == arr[1][0][1] && arr[1][0][1] == arr[2][0][2]) {
			printGameBoard();
			winningMessage();
			// diagonal from 3-7
		} else if (arr[0][0][2] == arr[1][0][1] && arr[1][0][1] == arr[2][0][0]) {
			printGameBoard();
			winningMessage();
		}
	}

	static void turn() {
		if (turn % 2 == 1) {
			xo = "X";
		} else {
			xo = "O";
		}
		System.out.println("");
		System.out.println(xo + ", please choose a number 1-9 where you would like your choice placed!");
		System.out.println("");
		printGameBoard();
		i = sc.nextInt();
		processChoice();
		turn++;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("The player who is X will go first.");

		while (turn < Integer.MAX_VALUE) {
			if ((arr[0][0][0] == "X" || arr[0][0][0] == "O") && (arr[0][0][1] == "X" || arr[0][0][1] == "O")
					&& (arr[0][0][2] == "X" || arr[0][0][2] == "O") && (arr[1][0][0] == "X" || arr[1][0][0] == "O")
					&& (arr[1][0][1] == "X" || arr[1][0][1] == "O") && (arr[1][0][2] == "X" || arr[1][0][2] == "O")
					&& (arr[2][0][0] == "X" || arr[2][0][0] == "O") && (arr[2][0][1] == "X" || arr[2][0][1] == "O")
					&& (arr[2][0][2] == "X" || arr[2][0][2] == "O")) {
				printGameBoard();
				System.out.println("This game is a DRAW!!!");
				System.exit(1);
			}
			turn();
		}
	}
}
