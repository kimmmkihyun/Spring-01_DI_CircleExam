package sample5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Sample5Main {

	public static void main(String[] args) {
		
		 //MessageImpl mi = new MessageImpl("영희");
		 //mi.setGreeting("Hello!"); 
		 
		Resource resource = new ClassPathResource("msg.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource); //bean을 만드는 공장
		MessageImpl mi = (MessageImpl) factory.getBean("mi");
		
		mi.sayHello();
	}

}
