import java.awt.Color;

public class BoardColoring 
{
	public void Coloring(int row, int col)
	{
		if(	Board_1vs1.board[row][col] == 0)
			Board_1vs1.boardPiece[row][col].setBackground(Color.ORANGE);
		else
			Board_1vs1.boardPiece[row][col].setBackground(Color.RED);
	}
}
