import java.awt.Color;

public class BoardColoring 
{
	public void Coloring(int row, int col)
	{
		//ĭ�� ��������� ������
		if(	Board_1vs1.board[row][col] == 0) 
			Board_1vs1.boardPiece[row][col].setBackground(Color.ORANGE);
		//ĭ�� ���� ������ ������
		else if (Board_1vs1.board[row][col] == Board_1vs1.whoseTurn)
			Board_1vs1.boardPiece[row][col].setBackground(Color.RED);
		else
			;
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
			System.out.println("Nowhere To Go"); // ������ ���� ���ٸ� �� ���� ���. ���� ������Ʈ �߰�
		}
	}
}
