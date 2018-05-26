/*
 * �ۼ��� : ����ȣ
 * 
 */

import java.awt.Color;
import java.awt.event.*;


public class ListenerClass extends Pawn implements ActionListener
{
	ChessButton btn = new ChessButton();
	ChessPieceGiver chessPiece = new ChessPieceGiver();
	Pawn pawn = new Pawn();
	Rook rook = new Rook();
	public ListenerClass(ChessButton btn, ChessPieceGiver chessPiece)
	{
		this.btn = btn;
		this.chessPiece = chessPiece;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int x = btn.getx();
		int y = btn.gety();
		System.out.println("(" + x + ", " + y + ")");
		System.out.println("'" + chessPiece.getChessPieceNum() + "' chess piece is selected." );
		
		// Move
		// �÷��̾ �����̱� ���� ��ư�� Ŭ���� ������ ���� Ȯ���Ѵ�.
		if (Board_1vs1.boardPiece[x][y].getBackground() == Color.ORANGE ||Board_1vs1.boardPiece[x][y].getBackground() == Color.RED ) // ������ �� �ִ� ���� ������ �����̴�.
		{
			// ������ �� �ִٸ� �װ����� �����̰� �Ѵ�.
			Board_1vs1.board[x][y] = Board_1vs1.board[Board_1vs1.activatedChessPiece[0]][Board_1vs1.activatedChessPiece[1]]; // ���� �ű��
			Board_1vs1.board[Board_1vs1.activatedChessPiece[0]][Board_1vs1.activatedChessPiece[1]] = 0; // ���� �ִ� ���� ����.
			
			// DEBUG ======================================================
			// ����׸� ���� ���� ü������ ���¸� ����Ѵ�.
			for (int i = 0; i < 8; i++)
			{
				for (int j = 0; j < 8; j++)
					System.out.printf("%3d ", Board_1vs1.board[i][j]);
				System.out.println("");
			}
			// ============================================================

			// ü������ �ٽ� �׸���.
			Board_1vs1.drawBoard();
			// ���� �ٲ۴�.
			if (Board_1vs1.whoseTurn == 1) Board_1vs1.whoseTurn += 2;
			else if (Board_1vs1.whoseTurn == 3) Board_1vs1.whoseTurn -= 2;
		}
		
		// �ڱ� ���� ü������ ����� ��.
		else if (Board_1vs1.whoseTurn == chessPiece.getChessPieceNum()/10)
		{
			// PAWN
			if (chessPiece.getChessPieceNum() % 10 == 0)
			{
				// ���� ������ �� �ִ��� �����ش�.
				pawn.Color(pawn.showCanMovePlace(x, y));
			}
			if (chessPiece.getChessPieceNum() % 10 == 3)
			{
				// ���� ������ �� �ִ��� �����ش�.
				rook.Color(rook.showCanMovePlace(x, y));
			}
			// ***********************************************
			// �� ������ �ٸ� ���� �ڵ带 �־��ּ���.
		}
	}
}
