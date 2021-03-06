package com.company.project000;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Chelsea_Calendar {
    int year = 0, month = 0, date =0;
    int hap = 0;
    JFrame frame;
    JPanel panel_1, panel_2;
    JButton left_Btn; 
    JButton right_Btn; 
    JButton[] button;    String[] btnname; JButton[] room; JButton[] dd;
    JButton next;
    JLabel label_1, label_2;
    JTextField textField;
    //
    
    
    ///
    Chelsea_Control control = new Chelsea_Control();
   public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	//생성자
    Chelsea_Calendar(){
  	  Calendar today = Calendar.getInstance();
      year = today.get(1);
      month = today.get(2)+1;
      date = today.get(5);
      /////////////////////////////////////////////////
      frame = new JFrame("예매 달력");
      panel_1 = new JPanel(new BorderLayout());
      panel_2 = new JPanel(new BorderLayout());
      left_Btn = new JButton("이전");
      right_Btn = new JButton("다음");
      next = new JButton("다음화면");
      /////////////////////////////////////////////////////////////////////////////
      dd = new JButton[42];
      button = new JButton[31]; //버튼 31개
      room = new JButton[] {new JButton("일"), new JButton("월"), new JButton("화"), new JButton("수"), 
            new JButton("목"),new JButton("금"),new JButton("토"),}; 
      label_1 = new JLabel();
      label_2 = new JLabel();
      ///////////////////////////////////
      frame.add(panel_1);
      frame.add(panel_2);
      frame.setLayout(new GridLayout(2,1));
      for(int i=0; i<room.length; i++)
      { 
         panel_2.add(room[i]);
         room[i].setBorder(new EmptyBorder(1,1,1,1));   //요일 줄사라짐
         room[i].setBackground(Color.PINK);
      }
      for(int i=0; i<dd.length; i++)
      { 
         dd[i]=new JButton(); 
         dd[i].setBackground(Color.lightGray); 
      }
      for(int i=0; i<dd.length; i++)
      { panel_2.add(dd[i]); }
      panel_2.setLayout(new FlowLayout());
      panel_2.setLayout(new GridLayout(7,7));
      //////////////////////////////////////////////
      panel_1.setLayout(new BorderLayout());
      panel_1.add(left_Btn, BorderLayout.WEST);
      panel_1.add(right_Btn, BorderLayout.EAST);
      label_1.setHorizontalAlignment(0);
      panel_1.add(label_2, BorderLayout.CENTER);
      label_2.setHorizontalAlignment(0);
      label_2.setFont(new Font("고딕", Font.BOLD, 15));
      for(int i=1; i<year; i++)
      {
         if(i%4==0 && i%100!=0 || i%400==0)
         { hap+=366;  } //윤년
         else
         { hap+=365; }
      }// year 
      int[] mon = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
      if(year%4==0 && year%100!=0 || year%400==0)
      { mon[2] = 29;  }   //윤년일때는 2월달 29일
      for(int i=1; i<month; i++) { hap +=mon[i]; }
      //Month
      hap+=date;
      int cnt=0;
      int cntt =0;
      for(int i=0; i <(hap-date+1)%7; i++)
      {
         dd[i].setText("★ ");     
         ++cntt;
      }
      for(int i=1; i<=mon[month]; i++)
      {   
         dd[cntt].setText(""+i);
         int find = i;
         ++cntt; 
         //System.out.print(i+"\t");
         if((hap-date+1+i)%7==0)
         { 
            //System.out.println();
         }
      }
      label_2.setText(year+"년 "+ month+"월 "+ date+"일");
      this.setYear(year);
      this.setMonth(month);
      this.setDate(date);
      //left_Btn.addActionListener(this);
      //right_Btn.addActionListener(this);
   }//생성자끝
   //함수
   public void createGui(int month) {
      ///////
      frame.setSize(550,400); frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      
      //////////////////////////////////////////////////////////////
   }//end createGui   
   public void createGui_prev(int month_prev) {
      Calendar today = Calendar.getInstance();
      ///////
      frame.setSize(550,400); frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      //////////////////////////////////////////////////////////////
      int year = 0, month = 0, date =0;
      int hap = 0;
      year = today.get(1);
//      month = today.get(2)+1;
      month = month_prev;
      if(month<=1)
      { return; }
      date = today.get(5);
///////////////////////////////////////////////////////
      for(int i=1; i<year; i++)
      {
         if(i%4==0 && i%100!=0 || i%400==0)
         { hap+=366;  } //윤년
         else
         { hap+=365; }
      }// year 
      
      int[] mon = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
      if(year%4==0 && year%100!=0 || year%400==0)
      { mon[2] = 29; } //윤년일때는 2월달 29일 
      for(int i=1; i<month; i++)
      { hap +=mon[i]; }
      //Month
      
      hap+=date;
      int cnt=0;

      int cntt =0;
      for(int i=0; i <(hap-date+1)%7; i++)
      {
         dd[i].setText("★ ");     
         ++cntt;  
      }
      for(int i=1; i<=mon[month]; i++)
      {   
         dd[cntt].setText(""+i);
         int find = i;
         ++cntt; 
         System.out.print(i+"\t");
         if((hap-date+1+i)%7==0)
         { 
            System.out.println();
         }
      }
      this.setYear(year);
      this.setMonth(month);
      this.setDate(date);
      label_2.setText(year+"년 "+ month+"월 "+ date+"일");
   }//end createGui_prev  
   public void createGui_next(int month_next) {
	      Calendar today = Calendar.getInstance();
	      ///////
	      frame.setSize(550,400); frame.setVisible(true);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setResizable(false);
	      frame.setLocationRelativeTo(null);
	      //////////////////////////////////////////////////////////////
	      int year = 0, month = 0, date =0;
	      int hap = 0;
	      year = today.get(1);
//	      month = today.get(2)+1;
	      month = month_next;
//	    month--;
	    //month_prev--;
	      date = today.get(5);
	///////////////////////////////////////////////////////
	      for(int i=1; i<year; i++)
	      {
	         if(i%4==0 && i%100!=0 || i%400==0)
	         { hap+=366;  } //윤년
	         else
	         { hap+=365; }
	      }// year 
	      
	      int[] mon = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
	      if(year%4==0 && year%100!=0 || year%400==0)
	      { mon[2] = 29; } //윤년일때는 2월달 29일 
	      for(int i=1; i<month; i++)
	      { hap +=mon[i]; }
	      //Month
	      
	      hap+=date;
	      int cnt=0;

	      int cntt =0;
	      for(int i=0; i <(hap-date+1)%7; i++)
	      {
	         dd[i].setText("★ ");     
	         ++cntt;  
	      }
	      for(int i=1; i<=mon[month]; i++)
	      {   
	         dd[cntt].setText(""+i);
	         int find = i;
	         ++cntt; 
	         System.out.print(i+"\t");
	         if((hap-date+1+i)%7==0)
	         { 
	            System.out.println();
	         }
	      }
	      this.setYear(year);
	      this.setMonth(month);
	      this.setDate(date);
	      label_2.setText(year+"년 "+ month+"월 "+ date+"일");
	   }//end createGui_prev   
//   @Override
//   public void actionPerformed(ActionEvent e) {
//      if(e.getSource().equals(left_Btn))
//      {
//         frame.setSize(550,400); frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setResizable(false);
//         frame.setLocationRelativeTo(null);
//         month--;
//         createGui_prev(month);
//      }
//      else if(e.getSource().equals(right_Btn))
//      {
//          frame.setSize(550,400); frame.setVisible(true);
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          frame.setResizable(false);
//          frame.setLocationRelativeTo(null);
//          month++;
//          createGui_next(month);
//          
//      }
   

//   public static void main(String[] args) {
//      Calendar today = Calendar.getInstance();
//      new Test001().createGui( today.get(2)+1);
//
//      
//   }//end main
    }
    	
//}//end class