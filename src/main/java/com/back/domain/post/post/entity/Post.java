package com.back.domain.post.post.entity;

import com.back.domain.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
