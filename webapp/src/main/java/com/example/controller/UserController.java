package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/user")
public class UserController {
  @GetMapping
  public String index() {
    return "user/index";
  }
}
