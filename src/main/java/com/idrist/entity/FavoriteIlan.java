package com.idrist.entity;

import com.idrist.entity.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tblfavoriteilan")
public class FavoriteIlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    User user;
    @ManyToOne
    Ilan ilan;
    @CreationTimestamp
    LocalDateTime createAt;
    @Enumerated(EnumType.STRING)
    Status status;
}
