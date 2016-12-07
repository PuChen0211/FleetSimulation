package com.spring.uber;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by puchen on 11/24/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.uber")
public class HelloWorldConfiguration {

}
