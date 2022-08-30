package kr.brains072;

public class Triangle extends Polygon {
	//생성자: 객체 초기화 담당
	//sub클래스로부터 객체를 생성할 때 super클래스의 객체(필드, 메소드)도 준비되어야 함
	public Triangle(int height, int width) {
		super(height, width);
		
		setName("Triangle");
	}
	
	
	@Override
	public int evaluate() {
		//int area = super.width * super.height / 2;--------1: 2번으로 안쓸 경우 이렇게도 쓸수 있음
		//super.area = super.width * super.height / 2;----------2.private의 영향으로 못씀
		//return area;----------1
		//return super.area;-------------2.private의 영향으로 못씀
		
		int area = getHeight() * getWidth() / 2;
		return area;
	}

}
