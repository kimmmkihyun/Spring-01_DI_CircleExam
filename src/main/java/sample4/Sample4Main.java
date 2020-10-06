package sample4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import sample3.Circle;

public class Sample4Main {

	public static void main(String[] args) {
		
		//CalcImpl calc = new CalcImpl(4);
		//calc.setSu1(9);  // �θ� �ڽİ� ������ �̸��� �޼��带 ������ �־�� �Ѵ�
		
		//calc.calculate();
		
		Resource resource = new ClassPathResource("cal.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource); //bean�� ����� ����
		CalcImpl ci = (CalcImpl) factory.getBean("calc");
		ci.calculate();
	}

}
