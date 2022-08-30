package p160_162;

public class example06_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//   *       123|*|567   i=4->j=4            +-3
		//  ***      12*|*|*67   i=3->j=345          +-2
		// *****     1**|*|**7   i=2->j=23456        +-1
		//*******    ***|*|***   i=1->j=1234567      +-0
		
		
		for(int i = 4 ; i > 0 ; i--) {
			for(int j = 1;  j < 7; j++) {
				if(j <=i-(i-1) || j<=i + (i-1)) {
					System.out.print(" ");
				} else {	
					System.out.print("*");
				}
			}
			System.out.println();
		}	

	}

}
