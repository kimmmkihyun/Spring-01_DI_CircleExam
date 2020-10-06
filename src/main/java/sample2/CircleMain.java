package sample2;

public class CircleMain {

	public static void main(String[] args) {
		
		double radius = 10.0;
		Point point = new PointImpl();
		point.setXpos(3.0);
		point.setYpos(4.0);
		
		Circle circle = new CircleImpl(radius, point);
		circle.display();

	}

}


//  DI  :  Dependecy Injection  
// interface를 활용해서 덜 의존적인 방법으로 프로젝트를 만들 수 있다. 
