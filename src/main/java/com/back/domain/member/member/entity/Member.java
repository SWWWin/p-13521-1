package com.back.domain.member.member.entity;

import com.back.domain.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Member extends BaseEntity {
    private String username;
    private String password;
    private String email;

}
