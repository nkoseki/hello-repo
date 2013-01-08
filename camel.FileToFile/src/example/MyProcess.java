package example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcess implements Processor {

	public void process(Exchange arg0) throws Exception {
	
		System.out.println("myProcess");

	}

}
