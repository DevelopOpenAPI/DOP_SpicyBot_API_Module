package com.src.spicy.SpicyBot.Entity;

import java.util.List;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestEntity {
	
	private String channel;
	
	private List<String> attachments;
	
	private String image_url;
	
	private String thumb_url;
	
	private String footer;
	
	private String footer_icon;
	
	private Long ts;
	
	public String getchannel() {
		return channel;
	}
	
	public void setchannel(String channel) {
		this.channel = channel;
	}
	
	public List<String> getattachments() {
		return attachments;
	}
	
	public void setattachments(List<String> attachments) {
		this.attachments = attachments;
	}
	
	public String getimage_url() {
		return image_url;
	}
	
	public void setimage_url(String image_url) {
		this.image_url = image_url;
	}
	
	public String getthumb_url() {
		return thumb_url;
	}
	
	public void setthumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}
	
	public String footer() {
		return footer;
	}
	
	public void setfooter(String footer) {
		this.footer = footer;
	}
	
	public String footer_icon() {
		return footer_icon;
	}
	
	public void setfooter_icon(String footer_icon) {
		this.footer_icon = footer_icon;
	}
	
	public Long getts() {
		return ts;
	}
	
	public void setts(Long ts) {
		this.ts = ts;
	}
}
