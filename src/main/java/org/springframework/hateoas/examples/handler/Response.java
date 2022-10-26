package org.springframework.hateoas.examples.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class Response {
	
	private LocalDateTime timestamp; 
	private HttpStatus httpstatus;
	private String error ;
	private String path;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}
	
	public Response(LocalDateTime timestamp, HttpStatus httpstatus, String error, String patah) {
		super();
		this.timestamp = timestamp;
		this.httpstatus = httpstatus;
		this.error = error;
		this.path = patah;
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}


	public HttpStatus getHttpstatus() {
		return httpstatus;
	}


	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}

	
 
	
	
}
