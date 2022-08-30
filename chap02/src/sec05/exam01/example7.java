package sec05.exam01;

public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float var1 = 10f;
		float var2 = var1 / 100; //float 0.1f는 정확하게 0.1아 아니기 때문에 오류남
		if(var2 == 0.1) {
			System.out.println("10%입니다");
		} else {
			System.out.println("10%가 아닙니다.");
		}

	}

}
