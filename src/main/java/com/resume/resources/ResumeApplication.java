package com.resume.resources;



import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class ResumeApplication extends ResourceConfig {

	public ResumeApplication(){
		register(RequestContextFilter.class);
		register(MyResource.class);
		register(GreetingResource.class);
	}

}
