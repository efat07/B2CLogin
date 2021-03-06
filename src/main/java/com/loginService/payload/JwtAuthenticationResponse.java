package com.loginService.payload;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtAuthenticationResponse {
   
	private String id;
	
	private String value;
	
	private String user;
	
	private String message;
    
	@JsonIgnore
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse() {
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
