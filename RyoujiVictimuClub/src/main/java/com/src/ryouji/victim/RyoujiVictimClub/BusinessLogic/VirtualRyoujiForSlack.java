package com.src.ryouji.victim.RyoujiVictimClub.BusinessLogic;

import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.src.ryouji.victim.RyoujiVictimClub.ChatBotLogic.ChatBotWordLogic;
import com.src.ryouji.victim.RyoujiVictimClub.Entity.RequestBodyEntity;
import com.src.ryouji.victim.RyoujiVictimClub.Entity.RequestEntity;

@RequestScoped
public class VirtualRyoujiForSlack {
	
	RequestEntity requestEntity = new RequestEntity();
	
	RequestBodyEntity requestBodyEntity = new RequestBodyEntity();
	
	ChatBotWordLogic chatBotWordLogic = new ChatBotWordLogic();
	
	public VirtualRyoujiForSlack() {
		
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
