package edu.kh.poly.ex1.model.dto;

public class Spark extends Car { // 경차
	
	private double discountOffer; // 할인혜택
	
	// 기본생성자
	public Spark() {
		// TODO Auto-generated constructor stub
	}
	
	// 매개변수생성자 + 부모
		

	public Spark(String engine, String fuel, int whell, double discountOffer) {
		super(engine, fuel, whell);
		this.discountOffer = discountOffer;
	}
	
	// Car.toString() 오버라이딩
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + " / " + discountOffer;
		}

	// getter/setter
	
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	
	
	
	

}
