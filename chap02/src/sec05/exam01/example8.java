package sec05.exam01;

import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디");
		String name = scanner.nextLine();
		
		System.out.print("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		
		/*if(name.equals("java")) { //중요!!
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
			
		}else {System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
		*/
		String a=name.equals("java") & (password ==12345) ? "로그인 성공" : ((password!=12345) ? "로그인 실패: 패스워드가 틀림" : "로그인 실패: 아이디가 존재하지 않음");
		
		System.out.println(a);
		
		
	}
}
