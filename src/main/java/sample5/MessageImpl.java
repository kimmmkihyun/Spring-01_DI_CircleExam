package sample5;

public class MessageImpl implements Message{
	
	private String name; //���� - ������ ����
	private String greeting; // Hello - setter �޼�������
	
	
	
	public String getGreeting() {
		return greeting;
	}



	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}



	public MessageImpl(String name) {
		super();
		this.name = name;
	}



	@Override
	public void sayHello() {
		
		System.out.println("name : "+name);
		System.out.println("greeting : "+greeting);
		
	}

}
