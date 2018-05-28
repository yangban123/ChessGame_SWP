public class King extends BoardColoring implements ChessPieceInterface

{

	public String showCanMovePlace(int originalRow, int originalCol)

	{

		String returnString = "";
		Board_1vs1.initBoardColor();

		

		//�Ʒ��� Ž��
		for(int row = originalRow + 1; row < 8; row++)
		{
			if(Board_1vs1.board[row][originalCol] != 0) // ������� ������ ������ ����
			{
				if(Board_1vs1.board[originalRow +1][originalCol]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
				{

					int temp[]= {originalRow +1, originalCol};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}
				}

				break;
			}
		
			//�̵�����
			int temp[] = {originalRow +1 , originalCol};

			for(int i = 0; i < temp.length; i++)
			{
				returnString += Integer.toString(temp[i]) + "@";
			}
		 }
		
		//���� Ž��
		for(int row = originalRow - 1; row > -1; row--) 

		{

			if(Board_1vs1.board[row][originalCol] != 0) // ������� ������ ������ ����
			{
				if(Board_1vs1.board[originalRow - 1][originalCol]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
				{

					int temp[]= {originalRow - 1, originalCol};
					
					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}
				}
				break;
			}
				
					//�̵�����
					int temp[] = {originalRow -1 , originalCol};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

				 }
		
		//������ Ž��
		for(int col = originalCol + 1; col < 8; col++)
		{
			if(Board_1vs1.board[originalRow][col] != 0) // ������� ������ ������ ����
			{
				if(Board_1vs1.board[originalRow][originalCol + 1]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
				{
					int temp[]= {originalRow, originalCol + 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}
				}
				break;
			}
			//�̵�����
			int temp[] = {originalRow , originalCol + 1};

			for(int i = 0; i < temp.length; i++)
			{
				returnString += Integer.toString(temp[i]) + "@";
			}
		}
		
				//���� Ž��
				for(int col = originalCol - 1; col > -1; col--) 
				{
					if(Board_1vs1.board[originalRow][col] != 0) // ������� ������ ������ ����
					{
						if(Board_1vs1.board[originalRow][originalCol - 1]/10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
						{
							int temp[]= {originalRow, originalCol - 1};
							
							for(int i = 0; i < temp.length; i++)
							{
								returnString += Integer.toString(temp[i]) + "@";
							}

						}
						break;
					  }

					//�̵�����
					int temp[] = {originalRow , originalCol - 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

				}

			// ������ �Ʒ� �밢�� Ž��
				for(int row = originalRow +1, col = originalCol +1; row < 8 && col < 8; row++, col++ )
				{
					if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
					{
						if(Board_1vs1.board[originalRow +1][originalCol +1] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
						{
							int temp[] = {originalRow +1, originalCol +1};

							for(int i = 0; i < temp.length; i++)

								returnString += Integer.toString(temp[i]) + "@";
						}
						break;
					}

					//�̵�����
					int temp[] = {originalRow + 1, originalCol + 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

			   }

			for(int row = originalRow +1, col = originalCol -1; row < 8 && col > -1; row++, col-- ) // ���� �Ʒ� �밢�� Ž�� //
			{
				if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
				{
					if(Board_1vs1.board[originalRow +1][originalCol -1] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
					{
						int temp[] = {originalRow +1, originalCol -1};

						for(int i = 0; i < temp.length; i++)

							returnString += Integer.toString(temp[i]) + "@";
					}
					break;
				}
				//�̵�����
				int temp[] = {originalRow + 1, originalCol - 1};

				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}

			}

			// ������ �� �밢�� Ž��
				for(int row = originalRow - 1, col = originalCol + 1; row > -1 && col < 8; row--, col++ )
				{
					if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
					{
						if(Board_1vs1.board[originalRow - 1][originalCol + 1] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
						{
							int temp[] = {originalRow - 1, originalCol + 1};

							for(int i = 0; i < temp.length; i++)
								returnString += Integer.toString(temp[i]) + "@";
						}
						break;
					}
					
					//�̵�����
					int temp[] = {originalRow - 1, originalCol + 1};

					for(int i = 0; i < temp.length; i++)
					{
						returnString += Integer.toString(temp[i]) + "@";
					}

				}
				
				// ���� �� �밢�� Ž��
				for(int row = originalRow - 1, col = originalCol - 1; row > -1 && col > -1; row--, col-- )
				{
					if(Board_1vs1.board[row][col] != 0) // ������� ������ ������ ����
					{
						if(Board_1vs1.board[originalRow - 1][originalCol - 1] / 10 != Board_1vs1.whoseTurn) // �ڱ� ���� �ƴ϶�� �����ϰ� ������ ����
						{
							int temp[] = {originalRow - 1, originalCol - 1};

							for(int i = 0; i < temp.length; i++)
								returnString += Integer.toString(temp[i]) + "@";
						}
						break;
					 }

					//�̵�����
					int temp[] = {originalRow - 1, originalCol - 1};

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