package kr.brains.api;

public class Overriding {
	public void testEquals(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			if(((String)o1).equals(((String)o2))) {
				//String들의 equals는 각 String 객체의 값을 비교하자
				System.out.println("두 문자열의 값이 같다.");
			}
			else
				System.out.println("두 문자열의 값이 다르다.");
		}
		else {
			//Object들의 equals의 값을 비교하는 것이 아닌 같은 객체인지 알아보자?
			if(o1.equals(o2)) {
				System.out.println("참조하는 객체가 같다.");
			}
			else
				System.out.println("참조하는 객체가 다르다.");
		}
	}
}
