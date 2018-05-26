/*
 * 작성자 : 박종현
 * 
 * */


import java.awt.Color;

public class Pawn extends BoardColoring implements ChessPieceInterface 
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
		if (Board_1vs1.whoseTurn == 1) // WHITE TURN
		{
			// 경우 1 = 처음 움직일 때
			// 앞의 두칸까지 움직일 수 있다.
			if (originalRow == 6 && 								  // 처음 장소에 있어야 한다.
				Board_1vs1.board[originalRow-1][originalCol] == 0 &&  // 가는 길에 말이 있으면 안된다.
				Board_1vs1.board[originalRow-2][originalCol] == 0)    // 가려는 곳에 말이 있으면 안된다.
			{
				int temp[] = {originalRow -2 , originalCol};
				for(int i = 0; i<temp.length;i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			
			// 경우 2 = 처음이 아닌 곳에서 움직일 때
			// 앞의 한칸으로만 움직일 수 있다.
			if (originalRow != 0 &&									// 체스판의 맨 상단에 있으면 안 된다.
				Board_1vs1.board[originalRow-1][originalCol] == 0)  // 가려는 곳에 말이 있으면 안된다.
			{
				int temp[] = {originalRow -1 , originalCol};
				for(int i = 0; i<temp.length;i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			
			// 경우 3 = 왼쪽 앙파상. 앞 대각선 방향에 상대방 체스말이 있을 때
			// 왼쪽 대각선으로 움직일 수 있다.
			if (originalCol != 0 &&										// 왼쪽 끝에 있지 않아야 한다.
				Board_1vs1.board[originalRow-1][originalCol-1] != 0 &&  // 빈칸이 아니라 체스말이 있어야 한다.
				Board_1vs1.board[originalRow-1][originalCol-1]/10 != 1) // 그 체스말은 자기 체스말이 아니어야 한다.
			{
				int temp[] = {originalRow -1 , originalCol-1};
				for(int i = 0; i<temp.length;i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			
			// 경우 4 = 오른쪽 앙파상. 앞 대각선 방향에 상대방 체스말이 있을 때
			// 오른쪽 대각선으로 움직일 수 있다.
			if (originalCol != 7 &&										// 오른쪽 끝에 있지 않아야 한다.
				Board_1vs1.board[originalRow-1][originalCol+1] != 0 &&  // 빈칸이 아니라 체스말이 있어야 한다.
				Board_1vs1.board[originalRow-1][originalCol+1]/10 != 1) // 그 체스말은 자기 체스말이 아니어야 한다.
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
			// 경우 1 = 처음 움직일 때
			// 앞의 두칸까지 움직일 수 있다.
			if (originalRow == 1 && 								// 처음 장소에 있어야 한다.
				Board_1vs1.board[originalRow + 1][originalCol] == 0 &&  // 가는 길에 말이 있으면 안된다.
				Board_1vs1.board[originalRow + 2][originalCol] == 0)  // 가려는 곳에 말이 있으면 안된다.
				{
				int temp[]= {originalRow + 2, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			// 경우 2 = 처음이 아닌 곳에서 움직일 때
			// 앞의 한칸으로만 움직일 수 있다.
			if (originalRow != 0 &&									// 체스판의 맨 상단에 있으면 안 된다.
				Board_1vs1.board[originalRow + 1][originalCol] == 0)  // 가려는 곳에 말이 있으면 안된다.
			{
				int temp[]= {originalRow + 1, originalCol};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			// 경우 3 = 왼쪽 앙파상. 앞 대각선 방향에 상대방 체스말이 있을 때
			// 왼쪽 대각선으로 움직일 수 있다.
			if (originalCol != 0 &&										// 왼쪽 끝에 있지 않아야 한다.
				Board_1vs1.board[originalRow + 1][originalCol - 1] != 0 &&  // 빈칸이 아니라 체스말이 있어야 한다.
				Board_1vs1.board[originalRow + 1][originalCol - 1]/10 != 3) // 그 체스말은 자기 체스말이 아니어야 한다.
			{
				int temp[]= {originalRow + 1, originalCol - 1};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
			
			// 경우 4 = 오른쪽 앙파상. 앞 대각선 방향에 상대방 체스말이 있을 때
			// 오른쪽 대각선으로 움직일 수 있다.
			if (originalCol != 7 &&										// 오른쪽 끝에 있지 않아야 한다.
				Board_1vs1.board[originalRow + 1][originalCol + 1] != 0 &&  // 빈칸이 아니라 체스말이 있어야 한다.
				Board_1vs1.board[originalRow + 1][originalCol + 1]/10 != 3) // 그 체스말은 자기 체스말이 아니어야 한다.
			{
				int temp[]= {originalRow + 1, originalCol + 1};
				for(int i = 0; i < temp.length; i++)
				{
					returnString += Integer.toString(temp[i]) + "@";
				}
			}
		}
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