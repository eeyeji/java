package kr.brains064.same;

public class Same {
	private int privateField = 1; //private method도 클래스 내부 사용 가능
	int defaultField = 2;
	protected int protectedField = 3;
	public int publicField = 4;
	boolean b =true;
	
	//void getPrivateField() {
	void printPrivateField() {
		System.out.println(privateField);
	}
	
	void setB(boolean bv) {
		b=bv;
	}
	
	boolean isB() {//boolean형의 getter 메소드 명명규칙
		return b;
	}

}
