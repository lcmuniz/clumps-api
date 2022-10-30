package com.eficaztech.clumps.nivel;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long nivelId;
    private String nome;
    private Integer pontos;
}
