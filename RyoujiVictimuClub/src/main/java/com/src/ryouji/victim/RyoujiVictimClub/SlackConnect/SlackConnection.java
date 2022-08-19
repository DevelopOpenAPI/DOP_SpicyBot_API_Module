package com.src.ryouji.victim.RyoujiVictimClub.SlackConnect;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;

@RequestScoped
public class SlackConnection {
	
	public SlackConnection() {
		
	}
	
	public Response Service(String Message) throws IOException {
		Response response = RequestSlack(Message);
		
		return null;
	}
	
	private Response RequestSlack(String Message) throws IOException {
		Slack slack = Slack.getInstance();

		String webhookUrl = "https://hooks.slack.com/services/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"; 
		Payload payload = Payload.builder().text(Message).build();

		WebhookResponse response = slack.send(webhookUrl, payload);
		return null;
		
	}

}
