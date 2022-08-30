package kr.brains072;

//다각형의 넓이를 구하기 위한 클래스를 정의하고 객체생성 후 활용
public abstract class Polygon { //추상메소드의 영향으로 추상클래스로 변환시켜줘야함
	//삼각형, 직사각형, 정사각형, 평행사변형, 사다리꼴
	
	private int height; //세로
	private int width; //가로 / 접근허용을 더 많이 시켜주기 위해선 디폴트로 바꿔줄 수 있음(int width) 
	private int area; //넓이
	
	private String name;
	
	
	
	public Polygon() { //기본생성자, 생성자가 하나도 없을 경우 컴파일러가 자동으로 만들지만 
		               //생성자가 1 이상일 경우에는 명시적으로 적어줘야함	
	}

	public Polygon(int height, int width) { //초기화?
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract int evaluate(); //추상메소드: 상속받는 쪽에서 구현
/*이 코드를 추상메소드로 변환시켜준 것이 위에 코드임
	int evaluate() { //평가하다
		return area;
	}
*/
}
