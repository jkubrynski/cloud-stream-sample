package com.kubrynski.streamdemo.permission;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(PermissionsQueue.class)
class PermissionsConfig {

}
