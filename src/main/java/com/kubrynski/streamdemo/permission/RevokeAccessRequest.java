package com.kubrynski.streamdemo.permission;

class RevokeAccessRequest {

	private final String login;

	RevokeAccessRequest(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

}
