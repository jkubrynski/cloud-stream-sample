package com.kubrynski.streamdemo.permission;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
class PermissionsCacheService {

	@StreamListener(PermissionsQueue.PERMISSIONS_IN)
	void handleCacheEviction(RevokeAccessRequest revokeAccessRequest) {
		// do some fancy business logic to handle cache eviction
	}

}
