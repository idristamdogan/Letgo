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
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tblilan")
public class Ilan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    User user;
    @ManyToOne

    Category category;
    String title;
    String description;
    String location;
    Double price;
    @CreationTimestamp
    LocalDateTime createAt;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToMany(mappedBy = "ilan",cascade = CascadeType.PERSIST)
    List<FavoriteIlan> favoriteIlans;
    @OneToMany(mappedBy = "ilan",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Image> images;

    @Override
    public String toString() {
        return "Ilan{" +
                user.getId() +

                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
