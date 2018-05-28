/*

 * �ۼ��� : ������

 * 

 * */





import java.awt.Color;



public class Pawn extends BoardColoring implements ChessPieceInterface 

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

		if (Board_1vs1.whoseTurn == 1) // WHITE TURN

		{

			// ��� 1 = ó�� ������ ��

			// ���� ��ĭ���� ������ �� �ִ�.

			if (originalRow == 6 && 								  // ó�� ��ҿ� �־�� �Ѵ�.

				Board_1vs1.board[originalRow-1][originalCol] == 0 &&  // ���� �濡 ���� ������ �ȵȴ�.

				Board_1vs1.board[originalRow-2][originalCol] == 0)    // ������ ���� ���� ������ �ȵȴ�.

			{

				int temp[] = {originalRow -2 , originalCol};

				for(int i = 0; i<temp.length;i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

			

			// ��� 2 = ó���� �ƴ� ������ ������ ��

			// ���� ��ĭ���θ� ������ �� �ִ�.

			if (originalRow != 0 &&									// ü������ �� ��ܿ� ������ �� �ȴ�.

				Board_1vs1.board[originalRow-1][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.

			{

				int temp[] = {originalRow -1 , originalCol};

				for(int i = 0; i < temp.length; i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

			

			// ��� 3 = ���� ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��

			// ���� �밢������ ������ �� �ִ�.

			if (originalCol != 0 &&										// ���� ���� ���� �ʾƾ� �Ѵ�.

				Board_1vs1.board[originalRow-1][originalCol-1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.

				Board_1vs1.board[originalRow-1][originalCol-1]/10 != 1) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.

			{

				int temp[] = {originalRow -1 , originalCol-1};

				for(int i = 0; i<temp.length;i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

			

			// ��� 4 = ������ ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��

			// ������ �밢������ ������ �� �ִ�.

			if (originalCol != 7 &&										// ������ ���� ���� �ʾƾ� �Ѵ�.

				Board_1vs1.board[originalRow-1][originalCol+1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.

				Board_1vs1.board[originalRow-1][originalCol+1]/10 != 1) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.

			{

				int temp[] = {originalRow -1 , originalCol+1};

				for(int i = 0; i<temp.length;i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

		}

		

		else if (Board_1vs1.whoseTurn == 3)	// BLACK TURN

		{

			// ��� 1 = ó�� ������ ��

			// ���� ��ĭ���� ������ �� �ִ�.

			if (originalRow == 1 && 								// ó�� ��ҿ� �־�� �Ѵ�.

				Board_1vs1.board[originalRow + 1][originalCol] == 0 &&  // ���� �濡 ���� ������ �ȵȴ�.

				Board_1vs1.board[originalRow + 2][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.

				{

				int temp[]= {originalRow + 2, originalCol};

				for(int i = 0; i < temp.length; i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

			// ��� 2 = ó���� �ƴ� ������ ������ ��

			// ���� ��ĭ���θ� ������ �� �ִ�.

			if (originalRow != 0 &&									// ü������ �� ��ܿ� ������ �� �ȴ�.

				Board_1vs1.board[originalRow + 1][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.

			{

				int temp[]= {originalRow + 1, originalCol};

				for(int i = 0; i < temp.length; i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

			// ��� 3 = ���� ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��

			// ���� �밢������ ������ �� �ִ�.

			if (originalCol != 0 &&										// ���� ���� ���� �ʾƾ� �Ѵ�.

				Board_1vs1.board[originalRow + 1][originalCol - 1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.

				Board_1vs1.board[originalRow + 1][originalCol - 1]/10 != 3) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.

			{

				int temp[]= {originalRow + 1, originalCol - 1};

				for(int i = 0; i < temp.length; i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

			

			// ��� 4 = ������ ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��

			// ������ �밢������ ������ �� �ִ�.

			if (originalCol != 7 &&										// ������ ���� ���� �ʾƾ� �Ѵ�.

				Board_1vs1.board[originalRow + 1][originalCol + 1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.

				Board_1vs1.board[originalRow + 1][originalCol + 1]/10 != 3) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.

			{

				int temp[]= {originalRow + 1, originalCol + 1};

				for(int i = 0; i < temp.length; i++)

				{

					returnString += Integer.toString(temp[i]) + "@";

				}

			}

		}

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