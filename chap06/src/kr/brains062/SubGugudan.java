package kr.brains062;

//Gugudan 클래스가 같은 패키지에 있는 경우(향후 import 되었거나)
//
public class SubGugudan extends Gugudan {
	//direction: up, down-up: dan부터 9단까지 / down: 2단부터 dan까지 출력
	//메소드 중첩(overloading)
	public void printFrom(int dan, String direction) {
		System.out.println("메소드 오버로딩");
	}

}
