package kr.brains.api;

public class Car {
	private double speed = 20;
	public void speedUp() {
		speed = speed * (1 + Math.random()); //Math 클래스: 수학과련
		System.out.println("속도증가" + speed);
	}

}
