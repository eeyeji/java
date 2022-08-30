package Arrays;

public class example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {
				{95, 86},                      //array[0].length=2
				{83, 92, 96},                  //array[1].length=3
				{78, 83, 93, 87, 88}           //array[2].length=5
			};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i =0; i < array.length; i++) {
			
			for(int j =0; j < array[i].length; j++) {
				
				sum += array[i][j];				
			}				
		}
        
        avg = sum / (double) (array[0].length + array[1].length + array[2].length);
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
