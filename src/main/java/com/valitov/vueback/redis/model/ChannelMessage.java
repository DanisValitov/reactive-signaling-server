package com.valitov.vueback.redis.model;

import lombok.Data;

@Data
public class ChannelMessage {

	private String channelId;

	private String messageFrom;

	private String messageTo;

	private Object messageBody;

	private Type type;

	private String user;

	private String name;

	private String connectedTo;

	public enum Type {
		message,
		login,
		updateUsers,
		offer,
		answer,
		candidate,
		RTC_ICE_CANDIDATE_CHANGE
	}

}
