package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
  @GetMapping("/test")
  public String test() {
    return "test/test";
  }
  
}
