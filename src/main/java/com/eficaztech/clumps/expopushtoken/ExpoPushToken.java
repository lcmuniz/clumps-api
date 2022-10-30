package com.eficaztech.clumps.expopushtoken;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema = "lcmuniz")
@Data
public class ExpoPushToken {
    @Id
    private String token;
    private String email;
}
