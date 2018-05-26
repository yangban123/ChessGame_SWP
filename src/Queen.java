/*
 * �ۼ��� : ����ȣ

 * 
 * */

import java.awt.Color;

public class Queen extends BoardColoring implements ChessPieceInterface
{
	public String showCanMovePlace(int originalRow, int originalCol)
	{
		String returnString = "";
		
		Board_1vs1.initBoardColor();
		
			for(int row = originalRow + 1; row < 8; row++) // �Ʒ��� Ž�� // 
			{
				if(Board_1vs1.board[row][originalCol] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[row][originalCol]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[]= {row, originalCol};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// ����ִ� ��� // 
				int temp[]= {row, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow - 1; row > -1; row--) // ���� Ž�� //
			{
				if(Board_1vs1.board[row][originalCol] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[row][originalCol]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[]= {row, originalCol};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// ����ִ� ��� // 
				int temp[]= {row, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int col = originalCol + 1; col < 8; col++) // ������ Ž�� // 
			{
				if(Board_1vs1.board[originalRow][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[originalRow][col]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[]= {originalRow, col};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// ����ִ� ��� // 
				int temp[]= {originalRow, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int col = originalCol - 1; col > -1; col--) // ���� Ž�� //
			{
				if(Board_1vs1.board[originalRow][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[originalRow][col]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[]= {originalRow, col};
						for(int i = 0; i < temp.length; i++)
							{
							returnString += Integer.toString(temp[i]) + "@";
							}
					}
					break;
				}
				// ����ִ� ��� // 
				int temp[]= {originalRow, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow +1, col = originalCol +1; row < 8 && col < 8; row++, col++ ) // ������ �Ʒ� �밢�� Ž�� //
			{
				if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[] = {row, col};
						for(int i = 0; i < temp.length; i++)
							returnString += Integer.toString(temp[i]) + "@";
					}
					break;
				}
				// ����ִ� ��� //
				int temp[]= {row, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow +1, col = originalCol -1; row < 8 && col > -1; row++, col-- ) // ���� �Ʒ� �밢�� Ž�� //
			{
				if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[] = {row, col};
						for(int i = 0; i < temp.length; i++)
							returnString += Integer.toString(temp[i]) + "@";
					}
					break;
				}
				// ����ִ� ��� //
				int temp[]= {row, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow - 1, col = originalCol + 1; row > -1 && col < 8; row--, col++ ) // ������ �� �밢�� Ž�� //
			{
				if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[] = {row, col};
						for(int i = 0; i < temp.length; i++)
							returnString += Integer.toString(temp[i]) + "@";
					}
					break;
				}
				// ����ִ� ��� //
				int temp[]= {row, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow - 1, col = originalCol - 1; row > -1 && col > -1; row--, col-- ) // ���� �� �밢�� Ž�� //
			{
				if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[] = {row, col};
						for(int i = 0; i < temp.length; i++)
							returnString += Integer.toString(temp[i]) + "@";
					}
					break;
				}
				// ����ִ� ��� //
				int temp[]= {row, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			// Ȱ��ȭ�� ü������ ��ġ�� �̰����� �����Ѵ�
			Board_1vs1.activatedChessPiece[0] = originalRow;
			Board_1vs1.activatedChessPiece[1] = originalCol;
		
		return returnString;
	}

}