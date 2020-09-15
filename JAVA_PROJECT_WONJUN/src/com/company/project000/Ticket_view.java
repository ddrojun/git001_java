package com.company.project000;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ticket_view {
	JFrame frame;
	JTextArea textArea;
	JLabel title, title1;
	JLabel ticket;
	JButton button;
	//
	ImageIcon icon;
	//생성자
	public Ticket_view() {
		frame = new JFrame();
		textArea = new JTextArea();
		title1 = new JLabel("Ticket");
		//title = new JLabel();
		//icon = new ImageIcon("images\\iconfinder_movie-08_1277184 (1).png");
		//title = new JLabel(icon, JLabel.CENTER);
		button = new JButton("메인화면으로");
		/*
		admin = new JButton(new ImageIcon(
      	Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("admin.png")))); 
		 */
		title = new JLabel(new ImageIcon(
		Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("iconfinder_movie-08_1277184 (1).png")))); 
		
		//
		frame.setLayout(null);
		//
		frame.add(title);
		title.setBounds(300, 20, 100, 50);
		//
		frame.add(title1);
		title1.setBounds(220, 20, 100, 50);
		title1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
		//
		frame.add(textArea);
		textArea.setBounds(0, 110, 700, 300);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
		//
		frame.add(button);
		button.setBounds(450, 70, 120, 40);
	}
	public void creategui() {
		//
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); frame.setSize(700,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	
//	public static void main(String[] args) {
//		new Ticket_view().creategui();
//	}

}//end class
