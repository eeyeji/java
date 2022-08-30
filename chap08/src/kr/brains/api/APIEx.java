package kr.brains.api;

public class APIEx {
	public static void main(String[] args) {
		Overriding over = new Overriding();
		
		//-----------------------------------------------
		//Class <Overriding> over2 = Overriding.class; //????
		//-----------------------------------------------
		
		Integer i1 = new Integer(100); 
		Integer i2 = new Integer(100); 
		
		if(i1 == i2) //두 참조변수가 참조하는 객체가 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println("----------------------------------------");
		
		/*
		String s1 = "비즈니스 분석가"; //문자열은 예외적으로 같은 문자열이면 그 문자열을 각각 링크함으로 s1 == s2
		String s2 = "비즈니스 분석가";
		*/
		//System.exit(1); //종료
		String s1 = new String("비즈니스 분석가"); //new 생성자를 각각 만든다 따라서 s1 != s2
		String s2 = new String("비즈니스 분석가"); //두 문자열의 값이 같다.
		//String s2 = new String("비즈니스 분석"); //두 문자열의 값이 다르다.
		
		//----------------------------------------------------------
		System.out.println(s1.toString()); //재정의x?
		System.out.println(s2.toString());
		//----------------------------------------------------------
		
		if(s1 == s2) //두 참조변수가 참조하는 객체가 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		
		over.testEquals(s1, s2);
		System.out.println("----------------------------------------");
		Object o1 = new Object();
		Object o2 = new Object();
		//------------------------------------------------------------
		System.out.println(o1.toString()); //재정의?
		System.out.println(o2.toString());
		//------------------------------------------------------------
		
		System.out.println("----------------------------------------");
		if(o1 == o2)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		over.testEquals(o1, o2);
		System.out.println("----------------------------------------");
		
		//shift 연산은 비트단위 연산
		//128을 비트패턴 1000 0000 오른쪽으로 세번 밀기
		//            0001 0000 
		//128 / 8 과 같은 효과
		//즉, 1번 오른쪽으로 밀때마다 2로 나눈 효과가 나타남
		System.out.println(Integer.toBinaryString(128));
		System.out.println(128>>3);
		System.out.println(128<<3);
		
		Integer intRef = new Integer(100);
		//Integer inRef2 = Integer.valueOf(100);
		try {//예외처리 문장
		Integer inRef2 = Integer.valueOf("100L");
		System.out.println("예외 발생 시 실행 안됨");
		}catch(NumberFormatException nfe) { //checked exception
			System.out.println("예외발생 처리: " + nfe.getMessage());
		}
		finally {
			System.out.println("예외발생여부와 관계없이 실행되어야 하는 문장들");
		}
		Integer intRef3 = (Integer) 100; //wrapper class: autoboxing				
		System.out.println("예외처리 후: " + intRef3);
	}
}
