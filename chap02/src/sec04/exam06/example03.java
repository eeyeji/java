package sec04.exam06;

import java.util.Scanner;

public class example03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 이름: ");
		String inputdata1;
		inputdata1 = sc.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String inputdata2;
		inputdata2 = sc.nextLine();		
		
		System.out.println();
		
		
		//String jumin = inputdata2.substring(0,6); -> 문자열 6자리만 추출하기!
		
		String a ="주민번호 앞 6자리";
		System.out.printf("%s: %-6s \n", a, inputdata2);
		//System.out.printf("%s: %-6s \n", "주민번호 앞 6자리", jumin);
		System.out.println();
		
		System.out.print("3. 전화번호: ");
		String inputdata3;
		inputdata3 = sc.nextLine();

	}

}
