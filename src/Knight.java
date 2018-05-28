/*
 * 작성자 : 하진호

 * 
 * */

import java.awt.Color;

public class Knight extends BoardColoring implements ChessPieceInterface
{
	public String showCanMovePlace(int originalRow, int originalCol)
	{
		String returnString = "";
		
		Board_1vs1.initBoardColor(); // 보드 초기화 //
		try
		{
			if(Board_1vs1.board[originalRow + 2][originalCol + 1] != Board_1vs1.whoseTurn) //아래 2 오른쪽 1
			{
				int temp[]= {originalRow + 2, originalCol + 1};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{
			if(Board_1vs1.board[originalRow + 2][originalCol - 1] != Board_1vs1.whoseTurn) //아래 2 왼쪽 1
			{
				int temp[]= {originalRow + 2, originalCol - 1};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{
			if(Board_1vs1.board[originalRow - 2][originalCol + 1] != Board_1vs1.whoseTurn) //위 2 오른쪽 1
			{
				int temp[]= {originalRow - 2, originalCol + 1};
				for(int i = 0; i < temp.length; i++)
				{
						returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{

			if(Board_1vs1.board[originalRow - 2][originalCol - 1] != Board_1vs1.whoseTurn) //위 2 왼쪽 1
			{
					int temp[]= {originalRow - 2, originalCol - 1};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{


			if(Board_1vs1.board[originalRow + 1][originalCol + 2] != Board_1vs1.whoseTurn) //아래 1 오른쪽 2
			{
				int temp[]= {originalRow + 1, originalCol + 2};
				for(int i = 0; i < temp.length; i++)
				{					
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{

			if(Board_1vs1.board[originalRow - 1][originalCol - 2] != Board_1vs1.whoseTurn) //위 1 왼쪽 2
			{
					int temp[]= {originalRow - 1, originalCol - 2};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{
			if(Board_1vs1.board[originalRow + 1][originalCol - 2] != Board_1vs1.whoseTurn) //아래 1 왼쪽 2
			{
				int temp[]= {originalRow + 1, originalCol - 2};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{
			if(Board_1vs1.board[originalRow - 1][originalCol + 2] != Board_1vs1.whoseTurn) //위 1 오른쪽 2
			{
				int temp[]= {originalRow - 1, originalCol + 2};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
		try
		{
			if(Board_1vs1.board[originalRow - 1][originalCol - 2] != Board_1vs1.whoseTurn) //위 1 왼쪽 2
			{
				int temp[]= {originalRow - 1, originalCol - 2};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		}
			// 활성화된 체스말의 위치를 이곳으로 설정한다
			Board_1vs1.activatedChessPiece[0] = originalRow;
			Board_1vs1.activatedChessPiece[1] = originalCol;
		return returnString;
	}

}