public class King extends BoardColoring implements ChessPieceInterface

{

	public String showCanMovePlace(int originalRow, int originalCol)

	{

		String returnString = "";
		Board_1vs1.initBoardColor();

		

		//아래쪽 탐색
		for(int row = originalRow + 1; row < 8; row++)
		{
			if(Board_1vs1.board[row][originalCol] != 0) // 비어있지 않으면 루프문 종료
			{
				if(Board_1vs1.board[originalRow +1][originalCol]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
				{

					int temp[]= {originalRow +1, originalCol};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}
				}

				break;
			}
		
			//이동가능
			int temp[] = {originalRow +1 , originalCol};

			for(int i = 0; i < temp.length; i++)
			{
				returnString += Integer.toString(temp[i]) + "@";
			}
		 }
		
		//위쪽 탐색
		for(int row = originalRow - 1; row > -1; row--) 

		{

			if(Board_1vs1.board[row][originalCol] != 0) // 비어있지 않으면 루프문 종료
			{
				if(Board_1vs1.board[originalRow - 1][originalCol]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
				{

					int temp[]= {originalRow - 1, originalCol};
					
					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}
				}
				break;
			}
				
					//이동가능
					int temp[] = {originalRow -1 , originalCol};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

				 }
		
		//오른쪽 탐색
		for(int col = originalCol + 1; col < 8; col++)
		{
			if(Board_1vs1.board[originalRow][col] != 0) // 비어있지 않으면 루프문 종료
			{
				if(Board_1vs1.board[originalRow][originalCol + 1]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
				{
					int temp[]= {originalRow, originalCol + 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}
				}
				break;
			}
			//이동가능
			int temp[] = {originalRow , originalCol + 1};

			for(int i = 0; i < temp.length; i++)
			{
				returnString += Integer.toString(temp[i]) + "@";
			}
		}
		
				//왼쪽 탐색
				for(int col = originalCol - 1; col > -1; col--) 
				{
					if(Board_1vs1.board[originalRow][col] != 0) // 비어있지 않으면 루프문 종료
					{
						if(Board_1vs1.board[originalRow][originalCol - 1]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
						{
							int temp[]= {originalRow, originalCol - 1};
							
							for(int i = 0; i < temp.length; i++)
							{
								returnString += Integer.toString(temp[i]) + "@";
							}

						}
						break;
					  }

					//이동가능
					int temp[] = {originalRow , originalCol - 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

				}

			// 오른쪽 아래 대각선 탐색
				for(int row = originalRow +1, col = originalCol +1; row < 8 && col < 8; row++, col++ )
				{
					if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료
					{
						if(Board_1vs1.board[originalRow +1][originalCol +1] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
						{
							int temp[] = {originalRow +1, originalCol +1};

							for(int i = 0; i < temp.length; i++)

								returnString += Integer.toString(temp[i]) + "@";
						}
						break;
					}

					//이동가능
					int temp[] = {originalRow + 1, originalCol + 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

			   }

			for(int row = originalRow +1, col = originalCol -1; row < 8 && col > -1; row++, col-- ) // 왼쪽 아래 대각선 탐색 //
			{
				if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[originalRow +1][originalCol -1] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[] = {originalRow +1, originalCol -1};

						for(int i = 0; i < temp.length; i++)

							returnString += Integer.toString(temp[i]) + "@";
					}
					break;
				}
				//이동가능
				int temp[] = {originalRow + 1, originalCol - 1};

				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}

			}

			// 오른쪽 위 대각선 탐색
				for(int row = originalRow - 1, col = originalCol + 1; row > -1 && col < 8; row--, col++ )
				{
					if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료
					{
						if(Board_1vs1.board[originalRow - 1][originalCol + 1] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
						{
							int temp[] = {originalRow - 1, originalCol + 1};

							for(int i = 0; i < temp.length; i++)
								returnString += Integer.toString(temp[i]) + "@";
						}
						break;
					}
					
					//이동가능
					int temp[] = {originalRow - 1, originalCol + 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

				}
				
				// 왼쪽 위 대각선 탐색
				for(int row = originalRow - 1, col = originalCol - 1; row > -1 && col > -1; row--, col-- )
				{
					if(Board_1vs1.board[row][col] != 0) // 비어있지 않으면 루프문 종료
					{
						if(Board_1vs1.board[originalRow - 1][originalCol - 1] / 10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
						{
							int temp[] = {originalRow - 1, originalCol - 1};

							for(int i = 0; i < temp.length; i++)
								returnString += Integer.toString(temp[i]) + "@";
						}
						break;
					 }

					//이동가능
					int temp[] = {originalRow - 1, originalCol - 1};

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