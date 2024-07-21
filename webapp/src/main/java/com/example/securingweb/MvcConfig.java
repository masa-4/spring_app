package com.example.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {
  public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
    registry.addViewController("/test").setViewName("test/test");
    registry.addViewController("/login").setViewName("login");
	}
}
