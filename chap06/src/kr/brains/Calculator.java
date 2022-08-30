package kr.brains;

//하나의 파일에는 public class가 하나만 존재함
//public 클래스 이름은 파일명과 같아야 함
//public class가 없는 경우 이름은 선택 가능함
//public class는 다른 클래스에서 해당 클래스를 불러 사용가능
//그냥 class는 해당 클래스에서만 사용가능 하지만 다른 클래스에서는 불러오지 못함
//access modifier: 접근 수정자. 접근 식별자
//public, protected -> 같은 패키지에 있지 않아도 상속 관계에 있으면 사용 
//기본 -> 아무것도 쓰지 않음 / 같은 패키지에 있는 클래스들만 사용할 때
//private -> 나혼자 사용할 떼(해당 클래스 안에서만 사용)
//class의 이름은 대문자로 시작한다.
//생성자는 class 이름과 같고, 반환 유형이 없다.
public class Calculator {
	
	// field, attributes -> 속성
	private int operand1; //인스턴스 변수
	private int operand2;
	
	private String operator;
	
	//생성자->클래스이름과 같아야함
	//constructor: 객체 초기화
	//this

	public Calculator() { //기본(default) 생성자
		this.operand1 = 10;
		this.operator = "+";
		this.operand2 = 20;
	}
	
	public Calculator(int o1, String op, int o2) {
		this.operand1 = o1;
		this.operator = op;
		this.operand2 = o2;
	}
		
	//method -> 기능
	//custom method
	//int: 반환유형, 리턴타입-메소드 처리 후 반환하는 값의 유형
	public int calc() {
		int result = 0; //지역변수: 초기화 필수
		if(operator.equals("+")) 
			result = operand1 + operand2; //operand1...: 인스턴스 변수
		  else if (operator.equals("-")) 
			result = operand1 - operand2;
		  else if (operator.equals("*")) 
			result = operand1 * operand2;
		else if (operator.equals("/")) 
			result = operand1 / operand2;		
		return result;
		
		
	}
	public void eat() {
		
		
	}

}
