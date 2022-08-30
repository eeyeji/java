package kr.brains062;

public class GugudanEx {
	public static void main(String[] args) {
		
		//클래스의 생성자를 호출하여 객체를 생성하고, gugudan 참조변수에 할당
		// 참조변수도 참조하는 클래스와 같은 유형(또는 상위클래스형)
		//Gugudan gugudan = new Gugudan();
		//gugudan.printOne(3);
		//gugudan.printAll();
		//gugudan.printFrom(7);
		Gugudan.printOne(7); //Gugudan파일에서 static메소드에 저장되어있기 때문에 따로 생성자를 만들지 안아도 바로 실행 가능하다.
		
	
		//SubGugudan subRef = new SubGugudan();
		//subRef.printOne(7); // 상속되었기 때문에 호출해서 사용가능: extends Gugudan
		                    //만약에 Gugudan에서 private void printOne으로 바뀌면 오류남.
		//subRef.printFrom(5);
		//subRef.printFrom(5, "down");
		
		
	}

}
