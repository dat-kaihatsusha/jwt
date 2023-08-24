package com.oauth.jwt.auth.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "`user`")
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
