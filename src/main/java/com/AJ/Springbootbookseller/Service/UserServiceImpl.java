package com.AJ.Springbootbookseller.Service;

import com.AJ.Springbootbookseller.Model.Role;
import com.AJ.Springbootbookseller.Model.User;
import com.AJ.Springbootbookseller.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Autowired
    private PasswordEncoder passwordEncoderBCrypt;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoderBCrypt.encode(user.getPassword()));
        user.setRole(Role.USER);

        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }
    @Override
    public Optional<User> findByUserName(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public void makeAdmin(String username){
        userRepository.updateUserRole(username,Role.ADMIN);
    }


}
