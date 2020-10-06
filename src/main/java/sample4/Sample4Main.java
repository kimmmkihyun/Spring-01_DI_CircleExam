package sample4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import sample3.Circle;

public class Sample4Main {

	public static void main(String[] args) {
		
		//CalcImpl calc = new CalcImpl(4);
		//calc.setSu1(9);  // 부모가 자식과 동일한 이름의 메서드를 가지고 있어야 한다
		
		//calc.calculate();
		
		Resource resource = new ClassPathResource("cal.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource); //bean을 만드는 공장
		CalcImpl ci = (CalcImpl) factory.getBean("calc");
		ci.calculate();
	}

}
