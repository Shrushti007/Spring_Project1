package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;
		String configpath="./src/main/resources/spring-config.xml";
		
		context=new FileSystemXmlApplicationContext(configpath);
		Object loadedObject= context.getBean("greet");
		
		//loaded Object.sayGreeting();
		GreetingService gs = (GreetingService)loadedObject;
		String reply =gs.sayGreeting();
		System.out.println(reply);
	
	
	}

}
