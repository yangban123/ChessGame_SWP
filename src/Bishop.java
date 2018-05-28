/*

 * 작성자 : 하진호



 * 

 * */



public class Bishop extends BoardColoring implements ChessPieceInterface

{

	public String showCanMovePlace(int originalRow, int originalCol)

	{

		String returnString = "";

		

		Board_1vs1.initBoardColor();

		

		for(int row = originalRow +1, col = originalCol +1; row < 8 && col < 8; row++, col++ ) // 오른쪽 아래 대각선 탐색 //

		{

			if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료

			{

				if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료

				{

					int temp[] = {row, col};

					for(int i = 0; i < temp.length; i++)

						returnString += Integer.toString(temp[i]) + "@";

				}

				break;

			}

			// 비어있는 경우 //

			int temp[]= {row, col};

			for(int i = 0; i < temp.length; i++)

			{

				returnString += Integer.toString(temp[i]) + "@";

			}

		}

		for(int row = originalRow +1, col = originalCol -1; row < 8 && col > -1; row++, col-- ) // 왼쪽 아래 대각선 탐색 //

		{

			if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료

			{

				if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료

				{

					int temp[] = {row, col};

					for(int i = 0; i < temp.length; i++)

						returnString += Integer.toString(temp[i]) + "@";

				}

				break;

			}

			// 비어있는 경우 //

			int temp[]= {row, col};

			for(int i = 0; i < temp.length; i++)

			{

				returnString += Integer.toString(temp[i]) + "@";

			}

		}

		for(int row = originalRow - 1, col = originalCol + 1; row > -1 && col < 8; row--, col++ ) // 오른쪽 위 대각선 탐색 //

		{

			if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료

			{

				if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료

				{

					int temp[] = {row, col};

					for(int i = 0; i < temp.length; i++)

						returnString += Integer.toString(temp[i]) + "@";

				}

				break;

			}

			// 비어있는 경우 //

			int temp[]= {row, col};

			for(int i = 0; i < temp.length; i++)

			{

				returnString += Integer.toString(temp[i]) + "@";

			}

		}

		for(int row = originalRow - 1, col = originalCol - 1; row > -1 && col > -1; row--, col-- ) // 왼쪽 위 대각선 탐색 //

		{

			if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료

			{

				if(Board_1vs1.board[row][col] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료

				{

					int temp[] = {row, col};

					for(int i = 0; i < temp.length; i++)

						returnString += Integer.toString(temp[i]) + "@";

				}

				break;

			}

			// 비어있는 경우 //

			int temp[]= {row, col};

			for(int i = 0; i < temp.length; i++)

			{

				returnString += Integer.toString(temp[i]) + "@";

			}

		}

		// 활성화된 체스말의 위치를 이곳으로 설정한다

		Board_1vs1.activatedChessPiece[0] = originalRow;

		Board_1vs1.activatedChessPiece[1] = originalCol;

	

	return returnString;

	}

}