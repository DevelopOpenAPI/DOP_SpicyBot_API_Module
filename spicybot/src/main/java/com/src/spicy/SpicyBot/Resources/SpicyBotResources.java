package com.src.spicy.SpicyBot.Resources;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.src.spicy.SpicyBot.BusinessLogic.SpicyBotForSlack;
import com.src.spicy.SpicyBot.Entity.RequestBodyEntity;
import com.src.spicy.SpicyBot.Entity.RequestEntity;

@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("")
public class SpicyBotResources {
	
	SpicyBotForSlack spicyBotForSlack = new SpicyBotForSlack();
	
	@POST
	@Path("/spicywebhook")
	public String Logic1(@BeanParam RequestEntity requestEntity, RequestBodyEntity requestBodyEntity) throws IOException {
		return spicyBotForSlack.S_Service(requestEntity, requestBodyEntity);
	}

}
