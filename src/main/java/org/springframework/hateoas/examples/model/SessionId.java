package org.springframework.hateoas.examples.model;

import java.io.Serializable;

public class SessionId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sessionId ; 
	
	
	public SessionId(String sessionId) {
		this.sessionId =sessionId;
	}
	
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public SessionId() {
	}

	@Override
	public String toString() {
		return "SessionId [sessionId=" + sessionId + "]";
	}
	
	
	
	

}
