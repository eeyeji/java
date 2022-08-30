package p160_162;

public class example00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int x = 0;
		//for(x=1; x<=20; x++)
		//for(x=1; x<=20; x+=2)
		//
		for(x=2; x<=20; x+=2) { 
			
			sum +=x;
			System.out.println("x: " +x);
		}
		System.out.println("x반복은 한번 더 실행 후에 for loop탈출 " + x );
		System.out.println("sum: " + sum);	

	}

}
