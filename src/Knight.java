/*

 * �ۼ��� : ����ȣ



 * 

 * */



import java.awt.Color;



public class Knight extends BoardColoring implements ChessPieceInterface

{

	public String showCanMovePlace(int originalRow, int originalCol)

	{

		String returnString = "";

		

		Board_1vs1.initBoardColor(); // ���� �ʱ�ȭ //

		try

		{

			if(Board_1vs1.board[originalRow + 2][originalCol + 1] != Board_1vs1.whoseTurn) //�Ʒ� 2 ������ 1

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

			if(Board_1vs1.board[originalRow + 2][originalCol - 1] != Board_1vs1.whoseTurn) //�Ʒ� 2 ���� 1

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

			if(Board_1vs1.board[originalRow - 2][originalCol + 1] != Board_1vs1.whoseTurn) //�� 2 ������ 1

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



			if(Board_1vs1.board[originalRow - 2][originalCol - 1] != Board_1vs1.whoseTurn) //�� 2 ���� 1

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





			if(Board_1vs1.board[originalRow + 1][originalCol + 2] != Board_1vs1.whoseTurn) //�Ʒ� 1 ������ 2

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



			if(Board_1vs1.board[originalRow - 1][originalCol - 2] != Board_1vs1.whoseTurn) //�� 1 ���� 2

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

			if(Board_1vs1.board[originalRow + 1][originalCol - 2] != Board_1vs1.whoseTurn) //�Ʒ� 1 ���� 2

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

			if(Board_1vs1.board[originalRow - 1][originalCol + 2] != Board_1vs1.whoseTurn) //�� 1 ������ 2

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

			if(Board_1vs1.board[originalRow - 1][originalCol - 2] != Board_1vs1.whoseTurn) //�� 1 ���� 2

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

			// Ȱ��ȭ�� ü������ ��ġ�� �̰����� �����Ѵ�

			Board_1vs1.activatedChessPiece[0] = originalRow;

			Board_1vs1.activatedChessPiece[1] = originalCol;

		return returnString;

	}



}