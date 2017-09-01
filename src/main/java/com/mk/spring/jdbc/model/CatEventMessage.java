package com.mk.spring.jdbc.model;

public class CatEventMessage {

	private int eventMessageId;
	private String eventTypeCode;
	private String eventTopicKey;
	private String eventCorrelkationAn;

	public int getEventMessageId() {
		return eventMessageId;
	}
	public void setEventMessageId(int eventMessageId) {
		this.eventMessageId = eventMessageId;
	}
	public String getEventTypeCode() {
		return eventTypeCode;
	}
	public void setEventTypeCode(String eventTypeCode) {
		this.eventTypeCode = eventTypeCode;
	}
	public String getEventTopicKey() {
		return eventTopicKey;
	}
	public void setEventTopicKey(String eventTopicKey) {
		this.eventTopicKey = eventTopicKey;
	}
	public String getEventCorrelkationAn() {
		return eventCorrelkationAn;
	}
	public void setEventCorrelkationAn(String eventCorrelkationAn) {
		this.eventCorrelkationAn = eventCorrelkationAn;
	}
	
}
