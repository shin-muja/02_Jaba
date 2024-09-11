package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car {
	private int batteryCapacity; // 배터리 용량
	
	public Tesla() {
		
	}
	// 매개변수 생성자 + 상속받은것도 포함

	public Tesla(String engine, String fuel, int whell, int batteryCapacity) {
		super(engine, fuel, whell);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " +  batteryCapacity;
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	
}
