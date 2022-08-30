package kr.brains064.same;

//같은 패키지에 존재하는 클래스는 import 없이 사용 가능
//import kr.brains064.other.*;
import kr.brains064.other.Other;
import kr.brains064.other.Protected;

public class SameEx extends Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Same same = new Same();		
		System.out.println("Same Package");
		//System.out.println(same.privateField);
		System.out.println(same.defaultField);
		System.out.println(same.protectedField);
		System.out.println(same.publicField);
		
		SameEx se = new SameEx(); //se대신 protected 쓰면 오류: protected가 예약어이기 때문에 사용불가능
		System.out.println("Inheritance Relationship(상속관계)");
		//System.out.println(se.privateField);
		//System.out.println(se.defaultField);
		System.out.println(se.protectedField); //protected 메소드까지 접근 가능
		System.out.println(se.publicField);
		
		Other other = new Other();
		System.out.println("Other Package");
		//System.out.println(other.privateField);
		//System.out.println(other.defaultField);
		//protected가 되려면 상속관계에 있어야 함
		//System.out.println(other.protectedField);
		System.out.println(other.publicField);

	}

}
