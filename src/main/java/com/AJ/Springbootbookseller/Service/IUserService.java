package com.AJ.Springbootbookseller.Service;

import com.AJ.Springbootbookseller.Model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUserName(String username);

    void makeAdmin(String username);
}
