package com.AJ.Springbootbookseller.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username",unique = true,nullable = false,length = 100)
    private String username;

    @Column(name = "password",nullable = false,length = 255)
    private String password;

    @Column(name = "name",nullable = false,length = 100)
    private String name;

    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role",nullable = false)
    private Role role;

}
