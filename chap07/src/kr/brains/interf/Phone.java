package kr.brains.interf;

public interface Phone {
	//인터페이스에 선언된 모든 필드는 정적 최종이다. 즉, 상수변수이다.
	String PHONE_NUMBER = "010-4567-1234"; //public 생략
	//----------------------------------------------------
	void call(String phoneNumber); //abstract
	void receive();

}
