package kr.brains063;

public class CarEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = "현대자동차";
		System.out.println(str.charAt(3)); //특정 char(인덱스)를 선언하는 메소드: char.At()
		
		int i = 66;
		//Integer: int 기본형을 효과적으로 조작하기 위해 정의한 클래스
		//-> Wrapper Class: 기본자료형을 효과적으로 조작하기 위해 정의한 클래스
		//Integer.toHexString(): 정수를 16진수로 변환
		System.out.println(Integer.toHexString(i));
		//Integer.toBinaryString(): 정수를 2진수로 변환
		System.out.println(Integer.toBinaryString(i));
		*/
		//---------------------------------------------------------------------------------------------
		
		//System.out.println("현재모델: " + Car.model);//Car클래스의 static String model;의 영향
		//static은 객체 생성전에 이미 생성되었기 때문에 객체를 따로 생성하지 않아도 사용가능 
		//Car.model = "전기차";
		//System.out.println("현재모델: " + Car.model);
		
		System.out.println("현재모델: " + Car.MODEL);
		System.out.println("가장 큰 int 값: " + Integer.MAX_VALUE);
		int i = 1_000_000_000;
		int j = 1000000000;
		
		Car car =new Car();//객체 생성
		//car.model = "가스차"; //직접 인스턴스 변수 값 배정
		
		//문제1. 정수로 받을 경우
		//car.setGas(61); //setter를 이용한 인스턴스 변수 값 배정: 30L
		//문제2. 문자열로 받을 경우
		car.setGas("70L");
		System.out.println("현재 Gas: " + car.getGas()); //가스가 진짜 30L들어갔는지 확인하는 코드
		
		car.run();

	}


}
