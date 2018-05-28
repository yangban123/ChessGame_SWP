/*
 * 작성자 : 하진호
 * 
 */

import java.awt.Color;
import java.awt.event.*;


public class ListenerClass extends Pawn implements ActionListener
{
	ChessButton btn = new ChessButton();
	ChessPieceGiver chessPiece = new ChessPieceGiver();
	Pawn pawn = new Pawn();
	Bishop bishop = new Bishop();
	Rook rook = new Rook();
	Queen queen = new Queen();
	Knight knight = new Knight();
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
		// 플레이어가 움직이기 위해 버튼을 클릭한 것인지 먼저 확인한다.
		if (Board_1vs1.boardPiece[x][y].getBackground() == Color.ORANGE ||Board_1vs1.boardPiece[x][y].getBackground() == Color.RED ) // 움직일 수 있는 곳은 오렌지 색깔이다.
		{
			// 움직일 수 있다면 그곳으로 움직이게 한다.
			Board_1vs1.board[x][y] = Board_1vs1.board[Board_1vs1.activatedChessPiece[0]][Board_1vs1.activatedChessPiece[1]]; // 말을 옮기고
			Board_1vs1.board[Board_1vs1.activatedChessPiece[0]][Board_1vs1.activatedChessPiece[1]] = 0; // 원래 있던 곳은 비운다.
			
			// DEBUG ======================================================
			// 디버그를 위해 현재 체스판의 상태를 출력한다.
			for (int i = 0; i < 8; i++)
			{
				for (int j = 0; j < 8; j++)
					System.out.printf("%3d ", Board_1vs1.board[i][j]);
				System.out.println("");
			}
			// ============================================================

			// 체스판을 다시 그린다.
			Board_1vs1.drawBoard();
			// 턴을 바꾼다.
			if (Board_1vs1.whoseTurn == 1) Board_1vs1.whoseTurn += 2;
			else if (Board_1vs1.whoseTurn == 3) Board_1vs1.whoseTurn -= 2;
		}
		
		// 자기 색깔 체스말을 골랐을 때.
		else if (Board_1vs1.whoseTurn == chessPiece.getChessPieceNum()/10)
		{
			// PAWN
			if (chessPiece.getChessPieceNum() % 10 == 0)
			{
				// 어디로 움직일 수 있는지 보여준다.
				pawn.ShowColor(pawn.showCanMovePlace(x, y));
			}
			if (chessPiece.getChessPieceNum() % 10 == 1)
			{
				// 어디로 움직일 수 있는지 보여준다.
				bishop.ShowColor(bishop.showCanMovePlace(x, y));
			}
			if (chessPiece.getChessPieceNum() % 10 == 2)
			{
				// 어디로 움직일 수 있는지 보여준다.
				knight.ShowColor(knight.showCanMovePlace(x,  y));
			}
			if (chessPiece.getChessPieceNum() % 10 == 3)
			{
				// 어디로 움직일 수 있는지 보여준다.
				rook.ShowColor(rook.showCanMovePlace(x, y));
			}
			if (chessPiece.getChessPieceNum() % 10 == 4)
			{
				// 어디로 움직일 수 있는지 보여준다.
				queen.ShowColor(queen.showCanMovePlace(x,  y));
			}
			// ***********************************************
			// 이 밑으로 다른 말의 코드를 넣어주세요.
		}
	}
}
