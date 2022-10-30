package com.eficaztech.clumps.resposta;

import com.eficaztech.clumps.pergunta.Pergunta;
import com.eficaztech.clumps.usuario.Usuario;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long respostaId;
    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Pergunta pergunta;
    @ManyToOne
    @JoinColumn(name = "email")
    private Usuario usuario;
    private LocalDate dataResposta;
    private String resposta;
    private Boolean escolhida01;
    private Boolean escolhida02;
    private Boolean escolhida03;
    private Boolean escolhida04;
    private Boolean escolhida05;
    private Boolean escolhida06;
    private Boolean escolhida07;
    private Boolean escolhida08;
    private Boolean escolhida09;
    private Boolean escolhida10;
    private Boolean escolhida11;
    private Boolean escolhida12;
    private Boolean escolhida13;
    private Boolean escolhida14;
    private Boolean escolhida15;
    private Boolean escolhida16;
    private Boolean escolhida17;
    private Boolean escolhida18;
    private Boolean escolhida19;
    private Boolean escolhida20;
}
