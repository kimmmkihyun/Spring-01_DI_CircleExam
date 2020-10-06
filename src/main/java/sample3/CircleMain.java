package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CircleMain {

	public static void main(String[] args) {
		
		/*
		double radius = 10.0;
		Point point = new PointImpl();
		point.setXpos(3.0);
		point.setYpos(4.0);
		
		Circle circle = new CircleImpl(radius, point);
		circle.display();
		 */
		
		Resource resource = new ClassPathResource("abc.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource); //bean을 만드는 공장
		Circle circle = (Circle) factory.getBean("circle");
		circle.display();
		
		Point point = (Point) factory.getBean("point");  //pointimpl의 부모가 point이기 떄문에 부모가 관리자가 되도 문제가 없다.
		System.out.println("point.getXpos() : "+point.getXpos());
		System.out.println("point.getYpos() : "+point.getYpos());
		
		
	}

}


//  DI  :  Dependecy Injection  
// interface를 활용해서 덜 의존적인 방법으로 프로젝트를 만들 수 있다. 
