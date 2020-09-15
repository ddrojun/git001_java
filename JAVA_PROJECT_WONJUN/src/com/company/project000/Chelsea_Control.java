package com.company.project000;

import java.util.ArrayList;

import javax.swing.JOptionPane;
class Chelsea_Control{
	//멤버변수...
	Seat_view seat;
	ArrayList<Chelsea_Info> list=new ArrayList<Chelsea_Info>();
	Chelsea_Info info;
	///////////////////
	SignUp_view sign;
	//
	static int userChk;
	static int findPw;
	static int findId;
	static int login_find;
	int idChk=-1;
	///
	static int file=1;
	//
	static int reserveation; //예약여부
	static int cancel;
	 //생성자
	public Chelsea_Control() {
		seat = new Seat_view();
		info=new Chelsea_Info();
		//
		sign = new SignUp_view();
	}
	//////////////// C(#)RUD
	public void input(SignUp_view view) { //회원추가
		if(idChk!=-1) {
			JOptionPane.showMessageDialog(null,"중복확인을 체크해주세요.."); return;}
		else if(idChk==-1) {
		JOptionPane.showMessageDialog(null,view.text_name.getText()+"의 회원가입이 완료되었습니다.");
		info.setName(view.text_name.getText());
		info.setEmail(view.text_mail.getText());
		info.setId(view.text_id.getText());
		info.setPass(view.text_pw.getText());
		info.setSeat("-");
		info.setPrice(0);
		info.setBox("-");
		
		list.add(new Chelsea_Info(info.getName(),info.getEmail(),info.getId(),
				info.getPass(),info.getSeat(), info.getPrice(), info.getBox()  ));
		System.out.println(list);
		view.text_name.setText(null); view.text_mail.setText(null);
		view.text_id.setText(null); view.text_pw.setText(null);
		/////
		}
	}//end input
	//////////////// CR(#)UD
	public int userChk_login(Login_view login) { //로그인 조회
		int find = -1;
		login_find =-1;
		for(int ch=0; ch<list.size(); ch++)
		{
			Chelsea_Info temp = list.get(ch);
			if(login.text_id.getText().equals(temp.getId()) && login.text_pw.getText().equals(temp.getPass()) ) 
			{ login_find = ch; break; }
		}
		if(login_find == -1) 
		{ System.out.println("조회 실패 /// 아이디, 비번 다시 확인하세요 >>> "); }
		return login_find;
	}//end userChk_login
	public void userChk_1(SignUp_view sign) { //중복
		idChk=-1;
		for(int i=0; i<list.size(); i++)
		{
			Chelsea_Info temp = list.get(i);
//			if(list.get(i)==null) { break; }
			if(sign.text_id.getText().equals(temp.getId())) {idChk =i; JOptionPane.showMessageDialog(null, "중복");return; } // 중복이 아닌 경우
		}
		if(idChk==-1) {JOptionPane.showMessageDialog(null,"사용가능한 아이디입니다..");}	
	}
	//temp.getId()
	public int userChk(ArrayList<Chelsea_Info> list) { //예매확인조회
		int find =-1;
		userChk =-1;
		String id = JOptionPane.showInputDialog("아이디입력하시오");
		String pw = JOptionPane.showInputDialog("비밀번호입력하시오");
		for(int ch=0; ch<list.size(); ch++)
		{
			Chelsea_Info temp = list.get(ch);
			if(id.equals(temp.getId()) && pw.equals(temp.getPass()) ) 
			{
				userChk = ch;
//				find =ch;
				System.out.println("로그인성공");
				JOptionPane.showMessageDialog(null, "로그인성공");		
				break; 
			}
		}
		if(userChk== -1) 
		{
			System.out.println("조회 실패 /// 아이디, 비번 다시 확인하세요 >>> ");
			JOptionPane.showMessageDialog(null, "예매정보 없습니다  "); 
		}
		return userChk;
	}//end userChk
	//////////////////// 아이디찾기
	public int findIdChk(ArrayList<Chelsea_Info> list) {
		int find = -1;
		findId = -1;
		String name = JOptionPane.showInputDialog("이름 입력 >>> ");
		String email_1 =JOptionPane.showInputDialog("이메일 입력 >>> ");
		for(int ch=0; ch<list.size(); ch++)
		{
			Chelsea_Info temp = list.get(ch);
			if(name.equals(temp.getName())&& email_1.equals(temp.getEmail()) )
			{ findId =ch; break; }
		}
		if(findId ==-1)
		{
			JOptionPane.showMessageDialog(null, "가입정보 확인하세요 "); 
		}
		return findId; 

	}
	public int findPwChk(ArrayList<Chelsea_Info> list) {
		int find = -1;
		findPw = -1;
		String id = JOptionPane.showInputDialog("아이디 입력 >>> ");
		String email =JOptionPane.showInputDialog("이메일 입력 >>> ");	
		for(int ch=0; ch<list.size(); ch++)
		{
			Chelsea_Info temp = list.get(ch);		
			if(id.equals(temp.getId()) && email.equals(temp.getEmail()) )
			{ findPw =ch; break; }
		}
		if(findPw ==-1)
		{
			JOptionPane.showMessageDialog(null, "가입정보 확인하세요 ");
		}
		return findPw;
	}
	////////////////////
	//자리예약하기
	public int reservation(ArrayList<Chelsea_Info> list) { 
		boolean[][] reserChk = new boolean[6][7];
//		reserveation =-1;
		int reserveation = -1; /// -1이어야 예약가능
		for(int ch=0; ch<list.size(); ch++)
		{  ///빈자리가없다면 값을 못찾아서 그대로 -1 
			Chelsea_Info temp = list.get(ch);	
			if(list.get(login_find)==null) { break; }
			if(list.get(login_find).getDate().equals(temp.getDate()) && list.get(login_find).getSeat().equals(Chelsea_Using.temp)
					)
			{ 	
				reserveation =ch;    //reservation != -1
				//System.out.println("사용자(날짜/자리) : " + list.get(login_find).getDate()+" / "+ list.get(login_find).getSeat() );
				//System.out.println("(날짜/자리) : " + temp.getDate()+" / "+ temp.getSeat());
				break;
			}
			
		}
//		if(reserveation !=-1)
//		{
//			JOptionPane.showMessageDialog(null, "예약불가");
//		}
		if(reserveation == -1) // 찾았어
		{
			list.get(login_find).setSeat(Chelsea_Using.temp);	
			if(Chelsea_Using.temp.indexOf('V')!=-1)
			{ list.get(login_find).setPrice(170000); }
			else if(Chelsea_Using.temp.indexOf('R') != -1)
			{ list.get(login_find).setPrice(140000); }
			else if(Chelsea_Using.temp.indexOf('S') != -1)
			{ list.get(login_find).setPrice(110000); }
			////////////
			//reserChk[1][2] = true;
		}
		return reserveation;
		

	}//end reservation
	///////////////////
	public int reservation_cancel(ArrayList<Chelsea_Info> list) {
		int find = -1;
		cancel = -1;	//-1이면 예약취소 못해
		String id = JOptionPane.showInputDialog("아이디 입력 >>> ");
		String pass = JOptionPane.showInputDialog("비밀번호 입력 >>> ");
		for(int ch=0; ch<list.size(); ch++)
		{
			Chelsea_Info temp = list.get(ch);		
			if(id.equals(temp.getId()) && pass.equals(temp.getPass()) )
			{ 
				cancel =ch;
				list.remove(list.get(cancel).getSeat());
				System.out.println("확인1 : "+list.get(cancel).getSeat());
				list.remove(list.get(cancel).getDate());
				System.out.println("확인2 : "+list.get(cancel).getDate());
				break; 
				
			}
		}
		if(cancel ==-1)
		{
			JOptionPane.showMessageDialog(null, "예약정보 확인하세요 ");
		}
		return cancel;
		
		
		
	}//end reservation_cancel
	
	
	
	
}//end Control class
