package sec02.exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 0b1011; //2진수: 0b로 시작, 0과 1로 구성 
		int var2 = 0206; // 8진수: 0으로 시작하고 0~7숫자로 구성
		int var3 = 365; //10진수: 소수점이 없는 0~9숫자로 구성
		int var4 = 0xB3;//16진수: 0x or 0X로 시작, 0~9와 A~F or a~f로 구성
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);

	}

}
