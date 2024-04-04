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

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tblmessage")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    User sender;
    @ManyToOne
    User receiver;
    String text;
    @CreationTimestamp
    LocalDateTime senddate;
    @UpdateTimestamp
    LocalDateTime updatedate;
    @Enumerated(EnumType.STRING)
    Status status;
}
