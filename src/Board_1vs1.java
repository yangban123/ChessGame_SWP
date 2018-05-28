/*

 * 작성자 : 박종현

 * 

 */



import java.awt.*;

import javax.swing.*;



public class Board_1vs1

{

	public static ChessButton[][] boardPiece = new ChessButton[8][8];

	public static ChessPieceGiver[][] chessPiece = new ChessPieceGiver[8][8];

	

	public static int whoseTurn = 1; // 누구 턴인지 저장하는 변수. 1 = WHITE, 2 = RED, 3 = BLACK, 4 = GREEN

	public static int[] activatedChessPiece = new int[2]; // 현재 활성화되어 있는(=어디로 움직일 수 있는지 표시하고 있는 체스말) 체스말의 위치를 저장하는 변수.

	

	//=============================================

	// 10의 자리가 1 = WHITE, 2 = RED, 3 = BLACK, 4 = GREEN

	// KING = 5, QUEEN = 4, LOOK = 3, KNIGHT = 2, BISHOP = 1, PAWN = 0

	//=============================================

	public static int[][] board = {

			{33, 32, 31, 35, 34, 31, 32, 33},

			{30, 30, 30, 30, 30, 30, 30, 30},

			{00, 00, 00, 00, 00, 00, 00, 00},

			{00, 00, 00, 00, 00, 00, 00, 00},

			{00, 00, 00, 00, 00, 00, 00, 00},

			{00, 00, 00, 00, 00, 00, 00, 00},

			{10, 10, 10, 10, 10, 10, 10, 10},

			{13, 12, 11, 14, 15, 11, 12, 13}

	};

	

	static JFrame frame;

	

	public void initGame()

	{

		frame = new JFrame("1vs1 Chess Game");

		frame.setLayout(new GridLayout(8, 8));

		

		for (int i = 0; i < 8; i++)

			for (int j = 0; j < 8; j++)

			{

				chessPiece[i][j] = new ChessPieceGiver();

				chessPiece[i][j].ChessPieceChoose(board[i][j]);

			}

		

		for (int i = 0; i < 8; i++)

			for (int j = 0; j < 8; j++)

			{

				boardPiece[i][j] = new ChessButton(i, j);

				boardPiece[i][j].addActionListener(new ListenerClass(boardPiece[i][j], chessPiece[i][j]));

				if ((i+j) % 2 == 0)

					boardPiece[i][j].setBackground(Color.GRAY);

				else

					boardPiece[i][j].setBackground(Color.WHITE);

				boardPiece[i][j].add(chessPiece[i][j]);

				frame.add(boardPiece[i][j]);

			}

	

		// 프레임 설정

		frame.setSize(600, 600);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLocationRelativeTo(null); // 화면의 중간에 창을 띄운다.

		frame.setVisible(true);

	}

	

	// 체스판을 다시 그리는 함수.

	// 체스말을 옮긴 후 호출된다.

	public static void drawBoard()

	{

		for (int i = 0; i < 8; i++)

			for (int j = 0; j < 8; j++)

			{

				// 체스말 그림을 전부 지우고

				boardPiece[i][j].remove(chessPiece[i][j]);

				// 체스말 그림을 다시 그리고

				chessPiece[i][j].ChessPieceChoose(board[i][j]);

				// 체크무늬를 그린 후

				if ((i+j) % 2 == 0)

					boardPiece[i][j].setBackground(Color.GRAY);

				else

					boardPiece[i][j].setBackground(Color.WHITE);

				// 체스말 그림을 다시 이어붙이고 다시 그린다.

				boardPiece[i][j].add(chessPiece[i][j]);

				frame.revalidate();

				frame.repaint();

			}

		

	}

	

	public static void initBoardColor()

	{

		for (int i = 0; i < 8; i++)

		{

			for (int j = 0; j < 8; j++)

			{

				if ((i+j) % 2 == 0)

					Board_1vs1.boardPiece[i][j].setBackground(Color.GRAY);

				else

					Board_1vs1.boardPiece[i][j].setBackground(Color.WHITE);

			}

		}

	}

}