package com.kubrynski.streamdemo.permission;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
class PermissionService {

	private final PermissionsQueue permissionsQueue;

	PermissionService(PermissionsQueue permissionsQueue) {
		this.permissionsQueue = permissionsQueue;
	}

	void revokeAccess(String login) {
		// do some business login here

		// and then trigger the eviction on all nodes of this application
		permissionsQueue.permissionsOutputChannel()
				.send(MessageBuilder.withPayload(new RevokeAccessRequest(login)).build());
	}

}
