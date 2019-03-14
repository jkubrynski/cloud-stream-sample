package com.kubrynski.streamdemo.user;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(UsersQueue.class)
class UsersConfig {

}
