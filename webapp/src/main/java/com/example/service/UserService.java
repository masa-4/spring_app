package com.example.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.webapp.entity.Users;
import com.example.webapp.model.UserModel;
import com.example.webapp.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public Users createUser(String username, String password) {
      Users user = new Users();
      user.username = username;
      user.Password = password;
      user.Email = "test_create@exmale.com";
      return userRepository.save(user);
  }

  public List<Users> getAllUsers() {
    return userRepository.findAll();
  }
}
