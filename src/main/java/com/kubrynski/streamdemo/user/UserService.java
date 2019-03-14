package com.kubrynski.streamdemo.user;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
class UserService {

	private final UsersQueue userEvents;

	UserService(UsersQueue userEvents) {
		this.userEvents = userEvents;
	}

	void addUser(UserController.CreateUserRequest request) {
		userEvents.userOutputChannel()
				.send(MessageBuilder.withPayload(request).build());
	}
}
