package Arrays;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] javaScores = { {88, 95, 80}, {92, 96, 81}};
		int sum = 0;
		for(int x=0; x < javaScores.length; x++) {
			for(int y=0; y < javaScores[x].length; y++) {
				
				System.out.println("javaScores[" + x + "] [" + y +"] = " + javaScores[x][y] );
				sum += javaScores[x][y];
			}
		}
		System.out.println();
		System.out.println("javaScores의 총합은 " + sum + "입니다.");
	}

}
