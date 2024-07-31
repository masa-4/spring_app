package com.example.webapp.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.example.webapp.service.UserService;
import com.example.webapp.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public String index(Model model) {
   List<Users> users =  userService.getAllUsers();
    model.addAttribute("users", users);
    return "user/index";
  }

  @GetMapping("/create")
  public String create() {
    return "user/create";
  }

  @PostMapping("/createConfirm")
  public String createConfirm(@RequestParam String username, @RequestParam String password, Model model) {
    model.addAttribute("username", username);
    model.addAttribute("password", password);
    return "user/createConfirm";
  }

  @PostMapping("/save")
  public String save(@RequestParam String username, @RequestParam String password) {
    userService.createUser(username, password);
    return "redirect:/user";
  }

}
