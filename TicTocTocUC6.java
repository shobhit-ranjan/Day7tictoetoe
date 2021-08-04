import java.util.Random;
import java.util.Scanner;

public class TicTocTocUC6 {
	static int userSign, computerSign;
	static int turnLeft = 9;
	static int board[][] = new int[3][3];
	static boolean turn= true;

	public static void main(String[] args) {
		System.out.println("--Welcome to the Tic Tac Toe Game--");
		createNewBoard();
		Select();
		showBoard();
		selectPositionPlayer();
		showBoard();
		turn=tossForFirstChance();
	}

	public static void createNewBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = 0;
			}
		}
	}

	public static void Select() {
		System.out.println("Enter 1 for X or 2 for O :");
		Scanner sc = new Scanner(System.in);
		userSign = sc.nextInt();
		if (userSign == 1) {
			computerSign = 2;
		} else if (userSign == 2) {
			computerSign = 1;
		}
		System.out.println("You Selected : " + ((userSign == 1) ? "X" : "O"));
		System.out.println("Computer is : " + ((computerSign == 1) ? "X" : "O"));
		// sc.close();
	}

	public static void showBoard() {

		System.out.println("   " + XorO(board[0][0]) + " | " + XorO(board[0][1]) + " | " + XorO(board[0][2]));
		System.out.println("----------------");
		System.out.println("   " + XorO(board[1][0]) + " | " + XorO(board[1][1]) + " | " + XorO(board[1][2]));
		System.out.println("----------------");
		System.out.println("   " + XorO(board[2][0]) + " | " + XorO(board[2][1]) + " | " + XorO(board[2][2]));

	}

	public static void selectPositionPlayer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Position--- ");
		System.out.println("Enter Row number: ");
		int row = input.nextInt() - 1;
		System.out.println("Enter Column number: ");
		int col = input.nextInt() - 1;
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			if (board[row][col] == 0) {
				board[row][col] = userSign;
			} else {
				System.out.println("Select Empty position!");
			}
		} else {
			System.out.println("Enter only 1,2,3 for Row and Column!");
		}
	}

	public static char XorO(int a) {
		if (a == 0) {
			return ' ';
		}
		return (a == 1) ? 'X' : 'O';
	}
	public static boolean tossForFirstChance() {
		Random rand = new Random();
		int num= rand.nextInt(2);
		if(num==1) {
			return true;
		}
		else 
			return false;
	}
	}


