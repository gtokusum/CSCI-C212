import java.util.Scanner;

public class Main {


	/**
	 * Driver to run program
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		Computer cpu = new Computer();
		boolean gameStarted = true;
		String mainMenu = "To play enter 1, to quit press 2";
		while (gameStarted) {
			System.out.println(mainMenu);
			int menuInput = sc.nextInt();
			if (menuInput == 2) {
				gameStarted = false;
			}
			else {
				System.out.println(board.getBoard());
				for (int i = 0; i < 9; i++) {
					if (board.getWinner().equals("Player has won!")||board.getWinner().equals("Computer has won!")) {
						System.out.println(board.getWinner());
						if (board.getWinner().equals("Computer has won!")) {
							cpu.addToList(board.getBoard());
						}
					}
					else {
						if (i % 2 == 0) {
							System.out.println("Player's turn");
							int input = sc.nextInt();
							board.updateBoard(input,"x");
							System.out.println(board.getBoard());
						}
						else {
							System.out.println("Computer's turn");
							cpu.playerInput(board.getBoard());
							board.updateBoard(cpu.getInput(), "o");
							System.out.println(board.getBoard());
						}
					}
					if (i == 8 && board.getWinner().equals("Player has won!")||board.getWinner().equals("Computer has won!")) {
						System.out.println("Draw!");
					}
				}
			}
		}
		sc.close();
	}
}
