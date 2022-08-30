package kr.brains072;

public class Rectangle extends Polygon {
	public Rectangle(int height, int width) {
		
		//Polygon 클래스에 기본생성자와 초기화생성자? 둘다 존재할 경우 아래코드를 작성하지 않아도 
		//컴파일러가 묵시적으로 supper 클래스의 해당 생성자를 호출하기 때문에 실행 가능
		super(height, width);
		
		setName("Rectangle");
	}
	
	
	
	@Override  //annotation(어노테이션, 애노테이션): 컴파일러에게 컴파일을 잘 할 수 있도록 정보를 제공
	//재정의: 메소드 이름, 매개변수 갯수, 타입 동일
	public int evaluate() {
		//int area = super.width * super.height;-------------1
		//super.area = super.width * super.height; -------2.private 영향으로 못씀
		//return area;-------------------1
		//return super.area; -----------2.private 영향으로 못씀
		
		return (getHeight() * getWidth());
	}

}
