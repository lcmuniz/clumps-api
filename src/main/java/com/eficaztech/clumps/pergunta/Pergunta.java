package com.eficaztech.clumps.pergunta;

import com.eficaztech.clumps.enums.TipoPergunta;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long perguntaId;
    private Integer ordem;
    private String pergunta;
    private TipoPergunta tipoPergunta;
    private String opcao01;
    private String opcao02;
    private String opcao03;
    private String opcao04;
    private String opcao05;
    private String opcao06;
    private String opcao07;
    private String opcao08;
    private String opcao09;
    private String opcao10;
    private String opcao11;
    private String opcao12;
    private String opcao13;
    private String opcao14;
    private String opcao15;
    private String opcao16;
    private String opcao17;
    private String opcao18;
    private String opcao19;
    private String opcao20;
}
