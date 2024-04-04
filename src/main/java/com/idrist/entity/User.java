package com.idrist.entity;

import com.idrist.entity.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbluser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String password;
    String email;
    String phone;
    String profileimageurl;
    String location;
    @CreationTimestamp
    LocalDateTime createAt;
    @UpdateTimestamp
    LocalDateTime updateAt;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToMany(mappedBy = "sender",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<Message> sender;
    @OneToMany(mappedBy = "receiver",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<Message> receiver;
    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<Comment> user;
    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<Comment> commenter;
    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<Ilan> users;
    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<FavoriteIlan> usersfav;

}
