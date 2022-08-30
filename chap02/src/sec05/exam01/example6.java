package sec05.exam01;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students =30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils /students);
		System.out.println("학생 1명이 가지는 연필의 개수는 " + pencilsPerStudent + "입니다.");
		
        //남은 연필개수
		int pencilsLeft = (pencils%students);
		System.out.println("남은 연필의 개수는 " + pencilsLeft + "입니다.");
		
		

	}

}
