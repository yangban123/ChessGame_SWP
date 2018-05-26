/*
 * Author : 박종현
 * 
 */
import java.awt.image.BufferedImage;

public class ChessPieceGiver extends ImagePanel
{
	BufferedImage img;
	int chessPieceNum; // 어떤 체스말을 가지고 있는지 저장하는 변수
	public void ChessPieceChoose(int num)
	{
		chessPieceNum = num;
		img = null; // 이미지 초기화
		//======================================================
		// WHITE
		//======================================================
		if (num/10 == 1)
		{
			// PAWN
			if (num%10 == 0)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_PAWN);
			}
			// BISHOP
			else if (num%10 == 1)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_BISHOP);
			}
			// KNIGHT
			else if (num%10 == 2)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KNIGHT);
			}
			// LOOK
			else if (num%10 == 3)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_LOOK);
			}
			// QUEEN
			else if (num%10 == 4)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_QUEEN);
			}
			// KING
			else if (num%10 == 5)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.WHITE_KING);
			}
		}
		//======================================================
		// BLACK
		//======================================================
		else if (num/10 == 3)
		{
			// PAWN
			if (num%10 == 0)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_PAWN);
			}
			// BISHOP
			else if (num%10 == 1)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_BISHOP);
			}
			// KNIGHT
			else if (num%10 == 2)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KNIGHT);
			}
			// LOOK
			else if (num%10 == 3)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_LOOK);
			}
			// QUEEN
			else if (num%10 == 4)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_QUEEN);
			}
			// KING
			else if (num%10 == 5)
			{
				img
				= ChessPieceSprite.getInstace().getChessPiece(ChessPieceSprite.ChessPieceSpriteType.BLACK_KING);
			}
		}
		//======================================================
		// 체스말이 그곳에 없으면 패널을 비운다.
		//======================================================
		else
			img = null;
		
		// 받아낸 체스말 이미지를 패널로 만들어 반환한다.
		setImage(img);
	} // END ChessPieceChoose();
	
	// 어떤 체스말을 가지고 있는지 그 값을 리턴한다.
	public int getChessPieceNum ()
	{
		return chessPieceNum;
	}
}
