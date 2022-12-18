package com.demo.dockerdemo;

import com.demo.dockerdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("/users")
  public List<User> showCreateUserForm() {
    return this.userRepository.findAll();
  }

  @PostMapping("/user")
  public void doCreateUser(@RequestBody UserCreation formData) {

    this.userRepository.save(User.builder().givenName(formData.getGivenName()).familyName(formData.getFamilyName()).build());
  }
}
