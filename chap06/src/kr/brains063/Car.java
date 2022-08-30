package kr.brains063;

public class Car {
	//2개의 인스턴스 멤버 필드, 4개의 인스턴스 메소드
	//String model;
	//public static final: 상수 변수 정의, 전체 대문자로 표기  -> 절대 변하지 않음
	public static final String MODEL = "가스차";//MODEL의 값은 가스차로 계속 유지!->CarEx에도 영향, 그곳에서도 마찬가지로 변경 불가능.
	//static String model = "가스차";
	 private int gas;
	 
	//Setter/Getter Method;
	//문제1일 경우
	//void setGas(int gas) { //가스를 주입한 결과
	//문제2일 경우
	void setGas(String gas) {
		String digit = gas.substring(0, gas.length()-1);
		//parseInt(): 숫자 문자열을 숫자로 파싱해주는 메소드
		int igas = Integer.parseInt(digit);
		
		if(igas > 60) {
			System.out.println((igas-60) + "L 초과, 60L만 주입함.");
			igas = 60;
		}
		this.gas = igas;		
	}
	
	int getGas() { //이 메소드를 이용하여 int gas 사용?
		return gas;
	}
/*	
	boolean isLeftGas() {
		if(gas == 0) {
			return false;
		}
		else {
			return true;
		}
	}
*/
	
	boolean isLeftGas() {
		boolean isLeft = true;
		if(gas == 0) {
			System.out.print("gas가 없습니다\n");
			isLeft = false;
		}
		else
			;//System.out.print("gas가 있습니다\n");
		return true;
	}
	
	void run() {
		//while(true) {
		//while(isLeftGas())
		while(gas != 0)
			if(gas > 0 ) {
				System.out.println("달립니다. gas 잔량(" + gas + ")");
				gas -= 1;
				}
			else {
				System.out.println("멈춥니다. gas 잔량(" + gas + ")" );
				//break;
				}
		}
}
