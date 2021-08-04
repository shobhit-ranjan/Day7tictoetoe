
public class TicTocTocUc1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe one player game");
		char[][] newgame = new char[3][3];
		emptyBoard(newgame);

	}

	public static void emptyBoard(char[][] newBoard) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				newBoard[i][j] = '_';
				System.out.print("\t" + newBoard[i][j]);
			}
			System.out.println(" ");
		}
	}

}