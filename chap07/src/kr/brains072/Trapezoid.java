package kr.brains072;

public class Trapezoid extends Polygon{ //사다리꼴
	private int upper; //윗변
	
	public Trapezoid(int height, int width, int upper) {
		super(height, width); // 수퍼클래스의 생성자를 호출 / width: 아랫변
		this.upper = upper;
		
		setName("Trapezoid");
	}
	
	//2.getUpper 만들경우
	public int getUpper() {
		return upper;
	}
	
	@Override
	public int evaluate() {
		//int area = (Upper + getWidth()) * getHeight() / 2;
		//2
		int area = (getUpper() + getWidth()) * getHeight() / 2;
		return area;
	}

}

