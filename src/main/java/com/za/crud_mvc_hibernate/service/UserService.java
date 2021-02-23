package com.za.crud_mvc_hibernate.service;

import com.za.crud_mvc_hibernate.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void add(User user);

    public void editUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
