package com.company.project000;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_view {
	//멤버변수
	JFrame frame;
	JLabel title, label;
	ImageIcon icon;
	JButton[] button;
	
	//생성자
	public Main_view(){
		frame = new JFrame("시작화면");
		button = new JButton[] {new JButton("예매하기"), new JButton("예매확인"), new JButton("회원가입"), new JButton("예약취소") };
		title = new JLabel("CHELSEA", JLabel.CENTER);
		//
		//icon = new ImageIcon("images\\iconfinder_Soccer_6159268_1.png"); // 자바파일 주소/   
//		label = new JLabel(icon, JLabel.CENTER);
		//
		label = new JLabel(new ImageIcon(
		Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("iconfinder_Soccer_6159268_1.png")))); 
		
		
		/////////////////
		frame.setLayout(null);
		frame.add(title);
		title.setFont(new Font("고딕", Font.BOLD, 30));
		title.setBounds(150, 20, 300, 50);
		//title.setBounds(0, 20, 100, 50);
		frame.add(label);
		label.setSize(200,300);
		label.setBounds(100, 70, 400, 300);
		for(int i=0; i<button.length; i++)
		{
			frame.add(button[i]);
			button[i].setBackground(Color.LIGHT_GRAY);
		}
		button[0].setBounds(145, 400, 300, 50);
		button[0].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
		button[1].setBounds(145, 460, 300, 50);
		button[1].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
		button[2].setBounds(145, 520, 300, 50);
		button[2].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
		button[3].setBounds(145, 580, 300, 50);
		button[3].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22)); //예약취소
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	//멤버함수
	public void createGui() {

		frame.setVisible(true); frame.setSize(600,700);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	}//end createGui
//	
//	public static void main(String[] args) {
//		new Main_view().createGui();
//	}
	
	
}//end class




