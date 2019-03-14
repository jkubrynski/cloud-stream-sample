package com.kubrynski.streamdemo.user;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

interface UsersQueue {

	@Output("users_out")
	MessageChannel userOutputChannel();
}
