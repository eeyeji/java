package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);//엔터키값=[CR=14,LF=10]
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);//엔터키값=[CR=14, LF=10]
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);

	}

}
