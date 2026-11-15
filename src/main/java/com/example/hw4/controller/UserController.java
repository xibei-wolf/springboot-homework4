package com.example.hw4.controller;

import com.example.hw4.entity.User;
import com.example.hw4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/findAll")
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @GetMapping("/findUserByName")
    public List<User> findUserByName(String name) {
        return userRepository.findUserByName(name);
    }
    @GetMapping("/findUserById")
    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }
    @GetMapping("/updateUser")
    public int updateUser(User user) {
        User user1 = new User();
        user1.setUid(4);
        user1.setUname("高文丽");
        user1.setUsex("女");
        return userRepository.updateUser(user1);
    }
    @GetMapping("/deleteUser")
    public int deleteUser(Integer id) {
        return userRepository.deleteUser(id);
    }
    @GetMapping("/addUser")
    public int addUser(User user) {
        User user1 = new User();
        user1.setUname("张三");
        user1.setUsex("男");
        return userRepository.addUser(user1);
    }
}
