package com.src.ryouji.victim.RyoujiVictimClub.Entity;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.HeaderParam;

@RequestScoped
public class RequestBodyEntity {
	
	@HeaderParam("channel")
	private String channel;
	
	@HeaderParam("attachments")
	private List<String> attachments;
	
	@HeaderParam("image_url")
	private String image_url;
	
	@HeaderParam("thumb_url")
	private String thumb_url;
	
	@HeaderParam("footer")
	private String footer;
	
	@HeaderParam("footer_icon")
	private String footer_icon;
	
	@HeaderParam("ts")
	private Long ts;
	
	public void setchannel(String channel) {
		this.channel = channel;
	}
	
	public String getchannel() {
		return this.channel;
	}
	
	public void setattachments(List<String> attachments) {
		this.attachments = attachments;
	}
	
	public List<String> getattachments() {
		return this.attachments;
	}
	
	public void setimage_url(String image_url) {
		this.image_url = image_url;
	}
	
	public String getimage_url() {
		return this.image_url;
	}
	
	public void setthumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}
	
	public String getthumb_url() {
		return this.thumb_url;
	}
	
	public void setfooter(String footer) {
		this.footer = footer;
	}
	
	public String getfooter() {
		return this.footer;
	}
	
	public void setfooter_icon(String footer_icon) {
		this.footer_icon = footer_icon;
	}
	
	public String getfooter_icon() {
		return this.footer_icon;
	}
	
	public void setts(Long ts) {
		this.ts = ts;
	}
	
	public Long getts() {
		return this.ts;
	}
}
