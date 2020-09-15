package com.company.project000;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Area_view {
	// 자리정하는 View
	JFrame frame;
	JButton button;
	//JButton[] button;
	JButton back;
	JLabel label, label2, label3;
	JPanel panel , panel2;
	ImageIcon icon;
	//생성자
	public Area_view() {
		frame = new JFrame("자리 예약");
		//button = new JButton[] {new JButton("A구역"),new JButton("B구역"),new JButton("C구역"),new JButton("D구역")};
		button = new JButton("홈구장");
		back = new JButton("초기메뉴");
		panel = new JPanel(new BorderLayout());
		panel2 = new JPanel();
		label2 = new JLabel("<html><br/><br/>[A]ZONE : 골대뒤편, 홈팀응원<br/>[B]ZONE : 선수입장보임<br/>[C]ZONE : 골대뒤편, 원정팀응원 <br/>"
				+ "[D]ZONE : 3층좌석");
		//
		//icon = new ImageIcon("images\\DSC084325.jpg"); // 
		//icon = new ImageIcon("images\\iconfinder_my-computer_43356.png");
		//label = new JLabel(icon, JLabel.CENTER);
		//
		label = new JLabel(new ImageIcon(
		Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("iconfinder_my-computer_43356.png"))));  //jar파일 만들때 경로
		//
		frame.setLayout(new GridLayout(2,2));
		frame.add(panel); 
		frame.add(panel2);
		//panel.add(button[0], BorderLayout.WEST);
		//panel.add(button[1], BorderLayout.SOUTH);
		//panel.add(button[2], BorderLayout.EAST);
		//panel.add(button[3], BorderLayout.NORTH);
		panel.add(button, BorderLayout.SOUTH);
//		panel.add(button5, BorderLayout.CENTER);
		panel.add(label, BorderLayout.CENTER);
		//panel2.add(label, BorderLayout.SOUTH);
		panel2.add(label2, BorderLayout.SOUTH);
		label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		//frame.add(back);
		panel2.add(back);
		//
	}
	public void createGui() {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

	
	}//end createGui
//	public static void main(String[] args) {
//		new Area_view().createGui();
//	}
//	
}//end class


