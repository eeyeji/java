package kr.brains072;

import java.util.ArrayList;
//매개변수에 배열을 사용하면 매개변수 개수를 가변적으로 사용할 수 있음
public class PolygonEx {

	public static void main(String[] args) {
/*
		Triangle triangle = new Triangle(50, 80);
		System.out.println("삼각형의 넓이: " + triangle.evaluate());
		
		Square square = new Square(30);
		System.out.println("정사각형의 넓이: " + square.evaluate());
		
		Rectangle rectangle = new Rectangle(40, 20);
		System.out.println("직사각형의 넓이: " + rectangle.evaluate());
		Trapezoid trapezoid = new Trapezoid(10, 20, 40); // height = 10
		System.out.println("사다리꼴의 넓이: " + trapezoid.evaluate());
*/		
 		//Polygon 형의 poly라는 참조변수 사용-----------------4
  		//Triangle, Square, Rectangle... 상속받음, 공통적인 특징을 가짐
  		
  		ArrayList<Polygon> arrPoly = new ArrayList<>();
  
  		Polygon poly = new Triangle(50, 80);
  		//System.out.println("삼각형의 넓이: " + poly.evaluate());
  		arrPoly.add(poly);
  			
  		poly = new Square(40);
  		//System.out.println("정사각형의 넓이: " + poly.evaluate());
  		arrPoly.add(poly);
   
  		poly = new Rectangle(20, 30);
  		//System.out.println("직사각형의 넓이: " + poly.evaluate());
  		arrPoly.add(poly);
  		
  		poly = new Trapezoid(10, 20, 40);
  		arrPoly.add(poly);
  		
  		for(Polygon p : arrPoly) {
  			whoIs(p); //매개변수의 유형에 따라 다른게 동작: (매개변수) 다형성
  		}
  		
  		String sRef = "Hello";
  		Integer iRef = Integer.valueOf(100); //Wrapper Class
  		Integer iRef2 = 30; //AutoBoxing
  		iRef = iRef2;
  		
  		Object o = (Object) iRef;
 /* 		
  		if(o instanceof String) {	//----------instanceof로 인해 오류 안남
  			sRef = (String) o; -------오류           //where are you from class?
  			sRef.substring(3); -------오류
  		}
 */
	}
  		
  		/*
  		 for(Polygon p : arrPoly){
  				System.out.println(p.getName() + "넓이는: " + p.evaluate());
  		 */
  		
  		public static void whoIs(Polygon p){
  			if(p instanceof Triangle)
  				System.out.println("삼각형의 넓이: " + p.evaluate());
  			
  			else if(p instanceof Square)
  				System.out.println("정사각형의 넓이: " + p.evaluate());
  			
  			else if(p instanceof Rectangle)
  				System.out.println("직사각형의 넓이: " + p.evaluate());
  			
  			else if(p instanceof Trapezoid)
  				System.out.println("사다리꼴 넓이: " + p.evaluate());
  			else
  				;
 
	}
}
