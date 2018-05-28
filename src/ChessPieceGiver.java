/*

 * Author : ������

 * 

 */

import java.awt.image.BufferedImage;



public class ChessPieceGiver extends ImagePanel

{

	BufferedImage img;

	int chessPieceNum; // � ü������ ������ �ִ��� �����ϴ� ����

	public void ChessPieceChoose(int num)

	{

		chessPieceNum = num;

		img = null; // �̹��� �ʱ�ȭ

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

		// ü������ �װ��� ������ �г��� ����.

		//======================================================

		else

			img = null;

		

		// �޾Ƴ� ü���� �̹����� �гη� ����� ��ȯ�Ѵ�.

		setImage(img);

	} // END ChessPieceChoose();

	

	// � ü������ ������ �ִ��� �� ���� �����Ѵ�.

	public int getChessPieceNum ()

	{

		return chessPieceNum;

	}

}