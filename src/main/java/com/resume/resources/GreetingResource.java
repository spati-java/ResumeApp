package com.resume.resources;



import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.resume.entity.Greeting;
import com.resume.service.GreetingService;



@Path("hello")
public class GreetingResource {
	
private static final Logger LOGGER=Logger.getLogger(GreetingResource.class.getName());

@Inject
GreetingService greetingService;

@GET
@Produces(MediaType.APPLICATION_JSON)
public Greeting getHello(){
	
	return greetingService.greet();
}

}
