package com.src.spicy.SpicyBot.BusinessLogic;

import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.src.spicy.SpicyBot.ChatBotLogic.ChatBotWordLogic;
import com.src.spicy.SpicyBot.Entity.RequestBodyEntity;
import com.src.spicy.SpicyBot.Entity.RequestEntity;

@RequestScoped
public class SpicyBotForSlack {
	
	RequestEntity requestEntity = new RequestEntity();
	
	RequestBodyEntity requestBodyEntity = new RequestBodyEntity();
	
	ChatBotWordLogic chatBotWordLogic = new ChatBotWordLogic();
	
	public SpicyBotForSlack() {
		
	}
	
	public String S_Service(RequestEntity requestEntity, RequestBodyEntity requestBodyEntity) throws IOException {
		String Response = RequestSlack(requestEntity, requestBodyEntity);
		return null;
	}
	
	private String RequestSlack(RequestEntity requestEntity, RequestBodyEntity requestBodyEntity) throws IOException{
		List<String> text = requestBodyEntity.getattachments();
		String inputWord = text.get(18);
		chatBotWordLogic.Service(inputWord);
		return null;
	}
}
