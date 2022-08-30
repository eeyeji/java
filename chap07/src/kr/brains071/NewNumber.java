package kr.brains071;

//import java.lang.Number;
import java.lang.*;
//abstract 사용한 이유
//-> public int intValue()를 주석 처리 했기때문에 구현해야하는 4가지중 3가지만 구현되었기 때문에 
/*
public abstract class NewNumber extends Number {

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		
		Number num =new Number(); //추상클래스는 객체 생성 불가
		
		NewNumber newNum = new NewNumber();
		
		return 0;
	}
*/
public class NewNumber extends Number {
	
	private int value;
	
	public NewNumber(int i) {
		value = i;
		
	}
	/*
	public byte byteValue() { //재정의
		return (byte) (value*2);
		//byte는 -128<=byte<=127까지 표현가능 그 이상의 값을 넣게되면 오버플로우 발생
	}
	*/
	
	
	public byte byteValue() { //재정의
		System.out.println("재정의 해보았습니다." + super.byteValue());
		return -1;
		//byte는 -128<=byte<=127까지 표현가능 그 이상의 값을 넣게되면 오버플로우 발생
	}
	
	//main에 shortValue 출력하는 코드 없어서 출력은 안됨
	//main에 System.out.println(newNum.shortValue()); 추가하면 출력됨
	public short shortValue() { //overriding
		return (short)(value *2);
	}
	
	@Override
	public long longValue() { //unimplemented
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	} 
	//추상클래스를 상속
	//추상클래스: 추상 메소드를 하나 이상 가지고 있는 클래스
	//추상 메소드: abstract 예약어와 메소드 선언(사용법)만 가지고 있는 메소드
	//상속받은 클래스에서 구현해야 함을 명시하는 역할
	//클래스: 모든 메소드가 구현된 상태
	
}
