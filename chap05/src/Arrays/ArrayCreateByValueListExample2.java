package Arrays;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores =new int[] {83, 90, 87, 65, 100};
		int sum1 = 0;
		
		for(int i =0; i <5; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[]{83, 90, 87, 65, 100});
		System.out.println("총합: " + sum2);
		System.out.println();
	}
	public static int add(int[] scores) {
		int sum = 0;
		int num =scores.length; //배열의 길이(사이즈)
		System.out.println("length: " + num);
		for(int i = 0; i < num; i++ ) {
			sum += scores[i];
		}
		return sum;
	}

}
