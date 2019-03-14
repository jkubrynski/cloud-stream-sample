package com.kubrynski.streamdemo.permission;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permissions")
class PermissionController {

	private final PermissionService permissionService;

	PermissionController(PermissionService permissionService) {
		this.permissionService = permissionService;
	}

	@DeleteMapping("/{login}")
	void revokeAccess(@PathVariable String login) {
		permissionService.revokeAccess(login);
	}
}
