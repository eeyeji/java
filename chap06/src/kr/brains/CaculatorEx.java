package kr.brains;

public class CaculatorEx {
	public static void main(String[] args) {
		//기본 생성자(매개변수가 없는 -> new 클래스의 생성자)를 호출하여 객체를 생성
		//calculator: 객체 참조 변수
		
		Calculator calculator = new Calculator();
		//Calculator 클래스를 가져다 쓰는 것이기 때문에 Calculator 클래스의 이름과 동일해야함
		System.out.println(calculator.calc());
		//GC = Garbage Collection: 동작으로 메모리에서 향후 제거
		calculator = new Calculator(23, "*", 40);
		System.out.println(calculator.calc());
		
		ModCalculator modRef = new ModCalculator();
		System.out.println(modRef.calc());
		
				
	}

}
