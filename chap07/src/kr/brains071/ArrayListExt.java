package kr.brains071;

//JCF: Java Collection Framework
//-> 이해: 상속, 추상클래스, 인터페이스, 제너릭(Generics)

import java.util.ArrayList;//컴파일러에게 지정한 패키지의 클래스 사용할 것임을 알림
//같은 패키지에 존재하는 클래스나 java.lang 패키지에 포함된 클래스는 import 없이 사용 가능
//import java.lang.String
public class ArrayListExt<T> extends ArrayList<T> {
	//-----------------------------------------------0823
	public void printHello() {
		System.out.println("클래스, 객체, 상속 어렵다.");
	}
	
	public boolean add() { 
		//중첩: 이름같고, 매개변수 갯수, 타입이 다름 -> 기존 메소드 사용가능
		super.add((T)"이예지");
		
		System.out.println("자바프로그래밍");
		return true;
	}
	public int lastIndexOf(Object o) { 
		//재정의: 이름, 갯수, 타입 모두 같음 - > 기존 메소드 사용 불가능
		return 100;
	}
	
}
