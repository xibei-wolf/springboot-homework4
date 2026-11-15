package com.example.hw4.repository;

import com.example.hw4.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserRepository {
    List<User> findAll();
    List<User> findUserByName(String name);
    User findUserById(int id);
    int updateUser(User user);
    int deleteUser(Integer id);
    int addUser(User user);
}
