/*

 * Author : ������

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

		// ������ ����

		JFrame frame = new JFrame("Chess Game");

		// ���̾ƿ��� BorderLayout����. ������ 10.

		frame.setLayout(new BorderLayout(10, 10));

		// ��ܿ� ������ �̸��� ����.

		JLabel title = new JLabel("Chess Game");

		JPanel titlePanel = new JPanel();

		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		titlePanel.add(title);

		frame.add(titlePanel, BorderLayout.NORTH);

		// �߰��� ��ư�� 3�� ���´�.

		JButton btn1vs1 = new JButton("1 vs 1");

		JButton btn2vs2 = new JButton("2 vs 2");

		JButton btnExit = new JButton("EXIT");

		JPanel centerPanel = new JPanel();

		centerPanel.setLayout(new GridLayout(3, 1, 10, 10));

		centerPanel.add(btn1vs1);

		centerPanel.add(btn2vs2);

		centerPanel.add(btnExit);

		frame.add(centerPanel, BorderLayout.CENTER);

		// ������� ����� ���� ��,��,�Ʒ����� �� �г��� �߰��Ѵ�.

		frame.add(new JPanel(), BorderLayout.WEST);

		frame.add(new JPanel(), BorderLayout.EAST);

		frame.add(new JPanel(), BorderLayout.SOUTH);

		// �׼� ������ ����

		btn1vs1.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent  arg0) {

				Board_1vs1 b1vs1 = new Board_1vs1();

				b1vs1.initGame();

			}

		});

		

		

		// ������ ����

		frame.setSize(400, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLocationRelativeTo(null); // ȭ���� �߰��� â�� ����.

		frame.setVisible(true);

	}

}