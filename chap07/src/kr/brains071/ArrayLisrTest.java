package kr.brains071;

public class ArrayLisrTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String>();
		//레퍼클래스: Integer, Double,,,
		
		Integer k = 100;// k는 Integer 클래스형 변수
		//implicit type conversion(묵시적 형변환): 오토박싱
		int j = 50;
		System.out.println(Integer.toBinaryString(k));
		
		ale.add(new String("고객")); //인덱스 0에 들어감
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		//------------------
		ale.add("경험");
		//------------------lastIndexOf마지막 인덱스 위치 반환
		//------------------재정의 후엔 어떤 값을 넣던 무조건 100 츌력
		ale.add("비즈니스");
		ale.add("분석가 과정");
		//--------------------------------0823
		ale.printHello();
		ale.add(); // add(T) add()  중첩(overloading)
		
		System.out.println(ale.lastIndexOf("경험"));
		//입력한 값의 현재 존재하는 인덱스 위치 반환
		
		//--------------------------------0823
		//for문: 반복횟수가 정해진 경우 사용, 순차 접근 가능, 제어변수에 따른 접근
		for(int i = 0; i < ale.size(); i+=2)
			System.out.println(ale.get(i)+ " ");
		
		System.out.println("");
		
		for(String s : ale) //foreach statement(for-each문): collection 객체의 순차 접근
			System.out.print(s + " ");
	}

}
