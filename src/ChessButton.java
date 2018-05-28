import javax.swing.JButton;



//ÇÏÁøÈ£



public class ChessButton extends JButton

{

	private int xpos, ypos;

	

	ChessButton(int x, int y)

	{

		xpos = x;

		ypos = y;

	}

	ChessButton(){}

	

	public int getx()

	{

		return xpos;

	}

	

	public int gety()

	{

		return ypos;

	}

	

	

}