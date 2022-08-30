package p160_162;

import java.util.Scanner;

public class example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		int balance = 0;
		Scanner scanner =new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			//.nextLine()은 String 값으로 받아지기 때문에 int로 바궈줘야함!
			
			switch(num) {
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				//balance 값에 입력값을 저장해라. 단 예금이기때문에 입력할때마다 + 되어야함.
				break;
				
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				//balance 값에 입력값을 적용해라. 단 출금이기 때문에 입력할때마다 -되어야함.
				break;
				
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				//잔고 값을 알기위해서 balance값을 출력해야함. 
				break;
				
			case 4: 
				run =false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");

	}

}
