package com.company.project000;

import java.util.Scanner;

class Seat_reservation_1 {
	///
	Seat_view seat;
	////
	String[][] seatField = new String[3][10];
//	String[][] seatField = new String[6][6];
//	ArrayList list = new ArrayList<>();
	public Seat_reservation_1() { // 이차원배열을 좌석으로 이용, 빈자리로 초기화
		//seat = new Seat_view();
		///
		for(int i= 0; i <seatField.length; i++) 
		{
			for (int j =0; j <seatField[i].length; j++) 
			{ seatField[i][j] = "---"; }
		}
	}//end Seat_reservation
	public void reserve() {
		System.out.println("이름을 입력하세요.>>");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int go = 1;
		while (go == 1) {
			if (validName(name)) 
			{ // 좌석을 예약한 적이 없다면
				System.out.println("좌석타입을 선택하세요.");
				System.out.println("1) VIP석 2) R석 3) B석 4) 메인메뉴 \n입력 >>> ");		//type
				scanner = new Scanner(System.in);
				int type = scanner.nextInt();
				if (type == 1)	// VIP석을 선택하였을 때
				{ 
					while (true) {
						try {
							System.out.println("좌석번호를 선택하세요.");
//							System.out.print("[VIP]");
							for (int i = 0; i < 10; i++) 
							{
								System.out.println("[VIP]" +"[" + (i + 1) + "]" +seatField[0][i]);
							}
							System.out.println(" ");
							scanner = new Scanner(System.in);
							int seatNum = scanner.nextInt();
							if (seatField[0][seatNum - 1] == "---") 
							{
								seatField[0][seatNum - 1] = name;
								System.out.println("예약이 되었습니다.");
								go = 0;
								break;
							} else 
							{ System.out.println("예약불가능한 자리입니다. 다시 선택하세요."); }
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("잘못된 입력입니다. 다시 입력하세요.");
						}
					}
				} 
				else if (type == 2) // R석을 선택하였을 때
				{
					while (true) 
					{
						try {
							System.out.println("좌석번호를 선택하세요. \n입력 >>> ");
//							System.out.print("[R]");
							for(int i = 0; i < 10; i++) 
							{
								System.out.println("[R]" +"[" + (i + 1) + "]" + seatField[1][i]);
							}
							scanner = new Scanner(System.in);
							int seatNum = scanner.nextInt();
							if (seatField[1][seatNum - 1] == "---") 
							{
								seatField[1][seatNum - 1] = name;
								System.out.println("예약이 되었습니다.");
								go = 0;
								break;
							}
							else 
							{ System.out.println("예약불가능한 자리입니다. 다시 선택하세요."); }
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("잘못된 입력입니다. 다시 입력하세요.");
						}
					}

				} 
				else if (type == 3) 
				{ // B석을 선택하였을 때
					while (true) {
						try {
							System.out.println("좌석번호를 선택하세요.");
//							System.out.print("[S]");
							for (int i = 0; i < 10; i++) 
							{
								System.out.println("[S]" +"[" + (i + 1) + "]" + seatField[2][i]);
							}
							scanner = new Scanner(System.in);
							int seatNum = scanner.nextInt();
							if (seatField[2][seatNum - 1] == "---")
							{
								seatField[2][seatNum - 1] = name;
								System.out.println("예약이 되었습니다.");
								go = 0;
								break;
							} 
							else 
							{
								System.out.println("예약불가능한 자리입니다. 다시 선택하세요.");
							}

						} catch (ArrayIndexOutOfBoundsException e) {

							System.out.println("잘못된 입력입니다. 다시 입력하세요.");
						}
					}
				}
				else if (type == 4)
				{ // 메인 메뉴 선택하였을 때
					break;
				}
				else 
				{ System.out.println("다시 입력해주세요."); }
			} 
			else 
			{ // validName가 false 일 때
				System.out.println("한 번 예약한 적이 있습니다.");
				break;
			}
		}
	}//end 
	public void confirm() { // 조회를 선택하였을 때
		for (int i = 0; i < 3; i++) 
		{
			if (i == 0) 
			{ System.out.print("[VIP석]"); }
			else if (i == 1) 
			{ System.out.print("[R석]"); }
			else if (i == 2) 
			{ System.out.print("[S석]"); }
			for (int j = 0; j < 10; j++) 
			{
				System.out.print("[" + (j + 1) + "] " + seatField[i][j]);
			}
			System.out.println(" ");
		}

	}//end confirm
	public void cancel() { // 취소를 선택하였을 때
		while (true) {
			try {
				System.out.println("취소할 좌석타입을 선택하세요.");
				System.out.println("1) VIP석 2) R석 3) S석 4) 메인메뉴");
				Scanner scanner = new Scanner(System.in);
				int type = scanner.nextInt();
				if (type == 4) 
				{ break; }
				for (int i = 0; i < 10; i++)
				{
					System.out.print("[" + (i + 1) + "] " + seatField[type - 1][i]);
				}
				System.out.println(" ");
				System.out.println("취소할 좌석번호를 선택하세요.");
				scanner = new Scanner(System.in);
				int seatNum = scanner.nextInt();
				if (seatNum >= 1 && seatNum <= 10) 
				{
					if (seatField[type - 1][seatNum - 1] != "---") 
					{
						seatField[type - 1][seatNum - 1] = "---";
						System.out.println("취소됐습니다.");
						break;
					} 
					else 
					{
						System.out.println("이미 빈 자리 입니다.");
						continue;
					}
				}
				else
				{ System.out.println("잘못된 입력입니다."); }
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}

	}//end cancel
	boolean validName(String name) { // 입력받은 이름으로 예약된 좌석이 있는지 확인
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 10; j++) 
			{
				if (seatField[i][j].equals(name)) 
				{
					return false;
				} 
				else 
				{ return true; }
			}
		}
		return true;
	}//end validName

}//end class
public class Test_seat_arraylist {
	
	public static void main(String[] args) {
		Seat_reservation_1 seat = new Seat_reservation_1();
		int menuNum;
		while (true) {
			System.out.println("1) 예약 2) 조회 3) 취소 4) 종료");
			Scanner scanner = new Scanner(System.in);
			menuNum = scanner.nextInt();
			if (menuNum == 1 || menuNum == 2 || menuNum == 3) 
			{
				switch (menuNum) {
				case 1:
					seat.reserve();
					break;
				case 2:
					seat.confirm();
					break;
				case 3:
					seat.cancel();
					break;
				}

			} 
			else if (menuNum == 4) 
			{
				System.out.println("종료합니다.");
				System.exit(0);
			} 
			else 
			{ System.out.println("잘못입력했습니다."); }
		}//end while

	}//end main

}//end class
