package example;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
	
		//from("file:/tmp/in?noop=true")
		from("direct:foo")
		//.log("File Body>>${body}")
		//.process(new MyProcess())
		//.split(body().tokenize("\n"))
		//.to("file:/tmp/out");
		.to("mqtt:localhost?publishTopicName=fooTopic");

	}

}
