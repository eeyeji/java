package kr.brains.api;

import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.*;

public class CarEx {
	//throws : Exception 유형의 예외가 발생하면 호출한 메소드로 전달
	//public static void main(String[] args) throws Exception {
	public static void main(String[] args) throws ClassNotFoundException  {	
		//<-try-catch문 안써도 컴파일 됨
	
		Calendar rightNow = Calendar.getInstance();
		
		System.out.println(rightNow.get(Calendar.YEAR) + "년"); //Calendar.YEAR에 해당되는 필드값을 가져와라
		System.out.println("----------------------------------------------------");
		Week today = null;
		
		for(Week w : Week.values())
			System.out.println(w);
		System.out.println("----------------------------------------------------");
		int dow = rightNow.get(Calendar.DAY_OF_WEEK); //주간위치 SUNDAY = 1...THURSDAY = 5...STHURSDAY = 7
		
		//System.out.println(dow);
		
		switch(dow) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
 
		}
		System.out.println("오늘은 " + today);
		System.out.println("----------------------------------------------------");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh:mm:ss");//처리
		System.out.println(sdf.format(date));//처리된 결과 출력
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(rightNow.HOUR);
		
		System.out.println("----------------------------------------------------");
		Class clazz = Car.class; // 직접 접근
		System.out.println(clazz.getPackageName() + "." + clazz.getSimpleName());
		
		//Class clazz1 = Class.forName("kr.brains.api.Car");
		//System.out.println(clazz1.getPackageName());
		
		Class clazz1 = null;
		//try {
			clazz1 =Class.forName("kr.brains.api.Car");
		//} catch (ClassNotFoundException e) {
		//	e.printStackTrace();
		//}
		System.out.println(clazz1.getPackageName());
		
	}

		
}
