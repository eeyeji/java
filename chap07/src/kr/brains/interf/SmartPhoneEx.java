package kr.brains.interf;

public class SmartPhoneEx {

	public static void main(String[] args) {
		//인터페이스들을 정의하고, 다중구현(multiple implementation)을 통해 클래스를 정의
		//정의한 클래스로부터 객체를 생성하고
		//생성된 객체와 상호작용을 통해 문제를 해결
		
		//Java는 다중 상속은 지원하지 않음, 즉 extends 뒤에 하나만 나타남
		//인터페이스는 다중구현이 가능함, 즉 implements 뒤에 여러개가 나타날 수 있음
		SmartPhone sp = new SmartPhone(); //객체 생성
		//sp.call("010-1234-5678");
		//sp.playMusic("번개맨송");
		//sp.sendMsg("010-1234-5678", "아!힘들다!");
		//-----------------------------------------------------
		sp.call(SmartPhone.PHONE_NUMBER);
		sp.playMusic("번개맨송");
		sp.sendMsg(SmartPhone.PHONE_NUMBER, "아!힘들다.");

		Timer t = sp; //sp가 참조하는 객체를 Timer 인터페이스 구현한 구현체
		
		((SmartPhone)t).call(SmartPhone.PHONE_NUMBER); //형 변환 연산 - 강제 타입 변환
		sp.call(SmartPhone.PHONE_NUMBER);
		
	}
}
