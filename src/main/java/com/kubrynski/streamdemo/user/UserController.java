package com.kubrynski.streamdemo.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
class UserController {

	private final UserService userService;

	UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	void addUser(@RequestBody CreateUserRequest request) {
		userService.addUser(request);
	}

	static class CreateUserRequest {

	}
}
