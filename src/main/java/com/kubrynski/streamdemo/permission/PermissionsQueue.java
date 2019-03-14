package com.kubrynski.streamdemo.permission;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

interface PermissionsQueue {

	String PERMISSIONS_IN = "permissions_in";

	@Output("permissions_out")
	MessageChannel permissionsOutputChannel();

	@Input(PERMISSIONS_IN)
	SubscribableChannel subscribeToPermissions();
}
