/*
 * 작성자 : 박상우

 * 
 * */

import java.awt.Color;

public class Rook extends BoardColoring implements ChessPieceInterface 
{
	//Board_1vs1 chessBoard = new Board_1vs1();
	//BoardColoring Coloring = new BoardColoring();
	
	// 어디로 이동할 수 있는지 보여주는 함수
	public String showCanMovePlace(int originalRow, int originalCol)
	{
		String returnString = "";
		// 체스판 색깔을 초기화한다.
		Board_1vs1.initBoardColor();
		// 갈 수 있는 곳을 오렌지 색깔로 칠한다.
		// 모든 경우의 수는 중첩된다.
//		if (Board_1vs1.whoseTurn == 1) // WHITE TURN
//		{
			for(int row = originalRow + 1; row < 8; row++) // 아래쪽 탐색 // 
			{
				if(Board_1vs1.board[row][originalCol] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[row][originalCol]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {row, originalCol};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {row, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow - 1; row > -1; row--) // 위쪽 탐색 //
			{
				if(Board_1vs1.board[row][originalCol] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[row][originalCol]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {row, originalCol};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {row, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int col = originalCol + 1; col < 8; col++) // 오른쪽 탐색 // 
			{
				if(Board_1vs1.board[originalRow][col] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[originalRow][col]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {originalRow, col};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {originalRow, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int col = originalCol - 1; col > -1; col--) // 왼쪽 탐색 //
			{
				if(Board_1vs1.board[originalRow][col] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[originalRow][col]/10 != Board_1vs1.whoseTurn) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {originalRow, col};
						for(int i = 0; i < temp.length; i++)
							{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {originalRow, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
//		}
		/*else if (Board_1vs1.whoseTurn == 3)	// BLACK TURN
		{
			for(int row = originalRow + 1; row < 8; row++) // 아래쪽 탐색 // 
			{
				if(Board_1vs1.board[row][originalCol] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[row][originalCol]/10 != 3) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {row, originalCol};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {row, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int row = originalRow - 1; row > -1; row--) // 위쪽 탐색 //
			{
				if(Board_1vs1.board[row][originalCol] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[row][originalCol]/10 != 3) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {row, originalCol};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {row, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int col = originalCol + 1; col < 8; col++) // 오른쪽 탐색 // 
			{
				if(Board_1vs1.board[originalRow][col] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[originalRow][col]/10 != 3) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {originalRow, col};
						for(int i = 0; i < temp.length; i++)
						{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {originalRow, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			for(int col = originalCol - 1; col > -1; col--) // 왼쪽 탐색 //
			{
				if(Board_1vs1.board[originalRow][col] != 0) // 비어있지 않으면 루프문 종료
				{
					if(Board_1vs1.board[originalRow][col]/10 != 3) // 자기 말이 아니라면 저장하고 루프문 종료
					{
						int temp[]= {originalRow, col};
						for(int i = 0; i < temp.length; i++)
							{
							returnString += Integer.toString(temp[i]) + "@";
						}
					}
					break;
				}
				// 비어있는 경우 // 
				int temp[]= {originalRow, col};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}*/
		// 활성화된 체스말의 위치를 이곳으로 설정한다
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
			System.out.println("Nowhere To Go"); // 움직일 곳이 없다면 이 문구 출력. 추후 프롬프트 추가
		}
	}*/
}