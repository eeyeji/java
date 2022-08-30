package Arrays;

public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int min = 1;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++) {
			
			if(max < array[i]) {
				
				max = array[i];
				System.out.println("sub " + max);				
			}
			if(min > array[i]) {
				
				min = array[i];
				System.out.println("sub " + min);				
			}
		}		
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}

}
