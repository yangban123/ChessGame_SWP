/*

 * �ۼ��� : �ڻ��



 * 

 * */



import java.awt.Color;



public class Rook extends BoardColoring implements ChessPieceInterface 

{

	//Board_1vs1 chessBoard = new Board_1vs1();

	//BoardColoring Coloring = new BoardColoring();

	

	// ���� �̵��� �� �ִ��� �����ִ� �Լ�

	public String showCanMovePlace(int originalRow, int originalCol)

	{

		String returnString = "";

		// ü���� ������ �ʱ�ȭ�Ѵ�.

		Board_1vs1.initBoardColor();

		// �� �� �ִ� ���� ������ ����� ĥ�Ѵ�.

		// ��� ����� ���� ��ø�ȴ�.

//		if (Board_1vs1.whoseTurn == 1) // WHITE TURN

//		{

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

//		}

		/*else if (Board_1vs1.whoseTurn == 3)	// BLACK TURN

		{

			for(int row = originalRow + 1; row < 8; row++) // �Ʒ��� Ž�� // 

			{

				if(Board_1vs1.board[row][originalCol] != 0) // ������� ������ ������ ����

				{

					if(Board_1vs1.board[row][originalCol]/10 != 3) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����

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

					if(Board_1vs1.board[row][originalCol]/10 != 3) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����

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

					if(Board_1vs1.board[originalRow][col]/10 != 3) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����

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

					if(Board_1vs1.board[originalRow][col]/10 != 3) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����

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

		}*/

		// Ȱ��ȭ�� ü������ ��ġ�� �̰����� �����Ѵ�

		Board_1vs1.activatedChessPiece[0] = originalRow;

		Board_1vs1.activatedChessPiece[1] = originalCol;

		return returnString;

	}

	/*public void Color(String returnedstring)

	{

		try

		{

			String[] temp = returnedstring.split("@");

			for(int i = 0 ; i < temp.length; i++)

			{

				Coloring(Integer.parseInt(temp[i++]), Integer.parseInt(temp[i]));

			}

		}

		catch(NumberFormatException a)

		{

			System.out.println("Nowhere To Go"); // ������ ���� ���ٸ� �� ���� ���. ���� ������Ʈ �߰�

		}

	}*/

}