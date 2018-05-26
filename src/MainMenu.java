/*
 * Author : 박종현
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu
{
	public static void main(String[] args)
	{
		// 프레임 생성
		JFrame frame = new JFrame("Chess Game");
		// 레이아웃은 BorderLayout으로. 간격은 10.
		frame.setLayout(new BorderLayout(10, 10));
		// 상단엔 게임의 이름을 띄운다.
		JLabel title = new JLabel("Chess Game");
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		titlePanel.add(title);
		frame.add(titlePanel, BorderLayout.NORTH);
		// 중간엔 버튼을 3개 놓는다.
		JButton btn1vs1 = new JButton("1 vs 1");
		JButton btn2vs2 = new JButton("2 vs 2");
		JButton btnExit = new JButton("EXIT");
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(3, 1, 10, 10));
		centerPanel.add(btn1vs1);
		centerPanel.add(btn2vs2);
		centerPanel.add(btnExit);
		frame.add(centerPanel, BorderLayout.CENTER);
		// 빈공간을 만들기 위해 좌,우,아래에도 빈 패널을 추가한다.
		frame.add(new JPanel(), BorderLayout.WEST);
		frame.add(new JPanel(), BorderLayout.EAST);
		frame.add(new JPanel(), BorderLayout.SOUTH);
		// 액션 리스너 설정
		btn1vs1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Board_1vs1 b1vs1 = new Board_1vs1();
				b1vs1.initGame();
			}
		});
		
		
		// 프레임 설정
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // 화면의 중간에 창을 띄운다.
		frame.setVisible(true);
	}
}
