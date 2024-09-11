package edu.kh.poly.ex1.model.dto;

public class Car {
	// 필드(속성)
		private String engine; // 엔진
		private String fuel; // 연료
		private int wheel; // 바퀴개수
		
		
		// 기능(생성자 + 메서드)
		public Car() {
			// TODO Auto-generated constructor stub
		}


		public Car(String engine, String fuel, int whell) {
			this.engine = engine;
			this.fuel = fuel;
			this.wheel = whell;
		}
		
		//Object.toString() 오버라이딩
		
		@Override // 오버라이딩 했다는걸 컴파일러에게 알려주는 Override 어노테이션
		public String toString() {
			// TODO Auto-generated method stub
			return engine + " / " + fuel + " / " + wheel;
		}
		
		


		public String getEngine() {
			return engine;
		}


		public void setEngine(String engine) {
			this.engine = engine;
		}


		public String getFuel() {
			return fuel;
		}


		public void setFuel(String fuel) {
			this.fuel = fuel;
		}


		public int getWheel() {
			return wheel;
		}


		public void setWheel(int whell) {
			this.wheel = whell;
		}
		
}
