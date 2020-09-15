package com.company.project000;

public class Chelsea_infoArea { //자리정보 담기
	//멤버변수
	private String box;	// 구역
	private String seat;	//좌석
	private int price;	//가격
	//getter / setter }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	//
	public String getBox() { return box; }
	public void setBox(String box) { this.box = box; }
	public String getSeat() { return seat; }
	public void setSeat(String seat) { this.seat = seat; }

	//생성자
	public Chelsea_infoArea() {	}
	public Chelsea_infoArea(String box, String seat, int price) {
		super();
		this.price = price;
		this.box = box;
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Chelsea_infoArea [box=" + box + ", seat=" + seat + ", price=" + price + "]";
	}



	
	
	//

	
	
}//end class
