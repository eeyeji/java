package p160_162;

public class example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int sum = 0;
		for(i=1; i<=100; i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println("1부터 100까지의 정수 중에서 3의 배수의 합은 " + sum);

	}

}
