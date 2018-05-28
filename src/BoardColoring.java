import java.awt.Color;



public class BoardColoring 

{

	public void Coloring(int row, int col)

	{

		//칸이 비어있으면 오렌지

		if(	Board_1vs1.board[row][col] == 0) 

			Board_1vs1.boardPiece[row][col].setBackground(Color.ORANGE);

		//칸에 말이 있으면 빨간색

		else

			Board_1vs1.boardPiece[row][col].setBackground(Color.RED);

	}

	public void ShowColor(String returnedstring)

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

	}

}