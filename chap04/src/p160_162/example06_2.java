package p160_162;

public class example06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-1234 3-234 2-34 1-4
				//1-1234 2-234 3-34 4-4
				//****
				// ***
				//  **
				//   *
				
				for(int i = 1; i < 5; i++) {
					for(int j = 1;  j < 5; j++) {
						if(i<=j) {
						System.out.print("*");
						} else {	
							System.out.print(" ");
						}
					}
					System.out.println();
				}	
				

			}

		}

