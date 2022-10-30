package com.eficaztech.clumps.desafio;

import com.eficaztech.clumps.atividade.Atividade;
import com.eficaztech.clumps.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "lcmuniz")
@Data
public class Desafio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long desafioId;
    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;
    @ManyToOne
    @JoinColumn(name = "email")
    private Usuario usuario;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime agendadoPara;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime realizadoEm;
}
