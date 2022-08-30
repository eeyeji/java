package Arrays;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); //강제 탈출 함수
		}
		//값의 수가 부족합니다가 처음에 출력됨!
		//Run -> Run Configurations -> Main탭에서 Project와 Main Class 확인하기 -> 동일하다면 Arguments 클릭 후 Program arguments 입력란에 10 20 입력 후 적용
		// 10 + 10 = 30 이라는 변경된(적용된) 결과값을 얻을 수 있음. 
		//이때 10과 20은 "10"과 "20"으로 인식 즉, 문자열로 인식되기 때문에 반드시 Integer.parseInt()메소드를 이용하여 정수로 변환시켜주는 과정이 필요함!
		//만약 정수로 변환할 수 없는 문자열이 주어졌을 경우에는 NumverFormatException이 발생함!
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
