package sample5;

public class MessageImpl implements Message{
	
	private String name; //영희 - 생성자 주입
	private String greeting; // Hello - setter 메서드주입
	
	
	
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
