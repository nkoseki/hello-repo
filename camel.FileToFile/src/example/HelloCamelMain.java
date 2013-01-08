package example;

import org.apache.camel.CamelContext;
import org.apache.camel.Main;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloCamelMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		RouteBuilder routeBuilder = new MyRoute();
			
		context.addRoutes(routeBuilder);
		
		System.out.println("Now Start Context");
		context.start();
		Thread.sleep(5000);
		System.out.println("Stop Context");
		context.stop();
		

	}

}
