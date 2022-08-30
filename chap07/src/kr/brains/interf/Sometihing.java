package kr.brains.interf;

public class Sometihing { //캡슐화(encapsulation): 클래스로 필드, 메소드 구성
	                      //->자료추상화(data abstraction)-자료를 처리하기 위한 최소한의 정보만을 사용할 수 있도록 함 
	                      //->정보은닉(information hiding)-필요한 정보만 접근하게 함
	                      //oop(객체지향프로그램)의 주요 특징: 캡슐화, 상속성, 다형성
//자료구조(Data structure): 재료
	private String title;
	private String content;
	//--------------------------------필드 추가되면 메소드에서도 계속 추가해줘야함. 
	private String writer;
	private String regDate;
	
//자료구조를 활용하는 메소드: 가공, 연산
	public void printAllFields() {
	//	System.out.println(title + " : " + content);
		System.out.print(title);
		System.out.print(content);
	//---------------------------------필드가 추가되었기 때문에 메소드에서도 추가시켜줌	
		System.out.print(writer);
		System.out.print(regDate);
	}

}
