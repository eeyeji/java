package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20L;//int타입의 허용범위 이내라면 L을 붙이지 않아도 됨.
		//long var3 = 1000000000000;
		//->int타입의 허용범위(-2,147,783,648 ~ 2,147,483,647)를 초과하였을 때는 반드시 L을 붙여 long 타입임을 텀파일러에게 알려주어야함!
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		

	}

}
