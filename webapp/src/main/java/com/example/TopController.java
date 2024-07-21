package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TopController {
  @GetMapping("/")
  public String top() {
    return "index";
  }
  
}
