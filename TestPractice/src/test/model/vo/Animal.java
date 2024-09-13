package test.model.vo;

public class Animal {
	private String type;
	private String name;
	private int leg;
	private boolean wing;
	private boolean swimming;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public boolean isWing() {
		return wing;
	}
	public void setWing(boolean wing) {
		this.wing = wing;
	}
	public boolean isSwimming() {
		return swimming;
	}
	public void setSwimming(boolean swimming) {
		this.swimming = swimming;
	}
	
	public void printSwim() {
		if(this.swimming) {
			System.out.println("수영을 할수 있습니다.");
		} else {
			System.out.println("수영을 할수 없습니다.");
		}
	}
	
	public void printWing() {
		if(this.wing) {
			System.out.println("날 수 있습니다..");
		} else {
			System.out.println("날수 없습니다.");
		}
	}
	
	public static void print() {
		System.out.println("시험");
	}
	
	
	
}
